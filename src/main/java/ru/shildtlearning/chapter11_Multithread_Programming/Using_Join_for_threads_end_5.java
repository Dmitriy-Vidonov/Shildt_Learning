package ru.shildtlearning.chapter11_Multithread_Programming;

// Использование join() для ожидания окончания потоков
class NewThreadJ implements Runnable {
    String name; // имя потока
    Thread t;
    NewThreadJ(String threadname) { // конструктор потока
        name = threadname;
        t = new Thread(this, name); // создаем поток под текущий объект нашего класса от Runnable
        System.out.println("Новый поток: " + t);
    }

    // Это точка входа для потока - метод, в котором выполняется работа потока
    public void run() {
        try{
            for(int i=5; i>0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}

public class Using_Join_for_threads_end_5 {
    public static void main(String[] args) {
        // СОЗДАЛИ ПОТОКИ
        NewThreadJ nt1 = new NewThreadJ("One");
        NewThreadJ nt2 = new NewThreadJ("Two");
        NewThreadJ nt3 = new NewThreadJ("Three");

        // ЗАПУСТИЛИ ПОТОКИ (каждый из них начинает при этом выполнять свою работу
        nt1.t.start(); // nt1 = объект класса, t = поле типа Thread внутри объекта класса, start() - запускает то что внутри run()
        nt2.t.start();
        nt3.t.start();

        // ПРОВЕРИЛИ РАБОТУ ПОТОКОВ
        System.out.println("Поток One работает: " + nt1.t.isAlive()); // проверка работы потока через isAlive()
        System.out.println("Поток Two работает: " + nt2.t.isAlive());
        System.out.println("Поток Three работает: " + nt3.t.isAlive());

        // ЖДЕМ ЗАВЕРШЕНИЯ РАБОТЫ ПОТОКОВ ПОСЛЕ ИХ РАБОТЫ
        try {
            System.out.println("Ожидание завершения потоков.");
            nt1.t.join(); // ожидаем завершения потока 1
            nt2.t.join(); // ожидаем завершения потока 2
            nt3.t.join(); // ожидаем завершения потока 3
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        // ПРОВРЕЛИ РАБОТУ ПОТОКОВ ПО ЗАВЕРШЕНИИ РАБОТЫ
        System.out.println("Поток One работает: " + nt1.t.isAlive());
        System.out.println("Поток One работает: " + nt2.t.isAlive());
        System.out.println("Поток One работает: " + nt3.t.isAlive());
        System.out.println("Завершение главного потока");
    }
}
