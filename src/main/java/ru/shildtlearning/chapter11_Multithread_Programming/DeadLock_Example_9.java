package ru.shildtlearning.chapter11_Multithread_Programming;

// Пример возникновения взаимоблокировки
class A_dl {
    synchronized void foo(B_dl b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в A_dl.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A_dl прерван");
        }
        System.out.println(name + " пытается вызвать B_dl.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Внутри A_dl.last()");
    }
}

class B_dl {
    synchronized void bar(A_dl a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в B_dl.bar");

        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B_dl прерван");
        }
        System.out.println(name + " пытается вызвать A_dl.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Внутри B_dl.last()");
    }
}

class DeadLock_Example_9 implements Runnable {
    A_dl a = new A_dl();
    B_dl b = new B_dl();
    Thread t;
    DeadLock_Example_9() { // конструктор
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadlockStart() {
        t.start();
        a.foo(b); // получить блокировку на a в этом потоке
        System.out.println("Назад в главный поток");
    }
    public void run() {
        b.bar(a); // получить блокировку на b в другом потоке
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        DeadLock_Example_9 dl = new DeadLock_Example_9();
        dl.deadlockStart();
    }
}
