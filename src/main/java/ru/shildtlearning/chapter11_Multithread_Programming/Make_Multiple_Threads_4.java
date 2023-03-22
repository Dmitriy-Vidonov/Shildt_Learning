package ru.shildtlearning.chapter11_Multithread_Programming;

// Пример создания множества потоков
class NewThread3 implements Runnable {
    String name; // имя потока
    Thread t;

    NewThread3(String threadname) { // Конструктор класса
        name = threadname;
        t = new Thread(this, name); // Создается новый объект класса Thread
        System.out.println("Новый поток: " + t);
    }

    // Это точка входа для потока - по сути то, что он собственно и будет выполлнять
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

public class Make_Multiple_Threads_4 {
    public static void main(String[] args) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        // Запустить потоки
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            // Ожидать окончания остальных потоков
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }
}
