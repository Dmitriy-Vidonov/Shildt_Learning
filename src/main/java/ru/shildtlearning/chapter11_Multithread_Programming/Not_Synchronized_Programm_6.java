package ru.shildtlearning.chapter11_Multithread_Programming;

// Эта программа не синхронизирована
class Callme {
    synchronized void call(String msg) { // c этим synchronized - синхронизирована
        // synchronized не пускает в call() входить остальным потокам, пока он занят текущим потоком
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прерван");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    public void run() {
        target.call(msg);
    }
}

class Not_Synchronized_Programm_6 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello!");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World!");

        // Запустить потоки
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        // ТАК КАК ПОТОКИ НЕ СИНХРОНИЗИРОВАНЫ, ВОЗНИКАЕТ СОСТОЯНИЕ "ГОНОК", КОГДА ВСЕ "БОРЯТСЯ" ЗА РЕСУРС И В ИТОГЕ ФИГНЯ
        // Для исправления нужно СЕРИАЛИЗИРОВАТЬ доступ к call(), т.е. ограничить доступ - один поток за раз.
        // лдя этого перед определением call() нужно ключевое слово synchronized:
        // void call(String msg) -> synchronized void call(String msg)

        // Ожидать окончания работы потоков
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прерван!");
        }
    }
}
