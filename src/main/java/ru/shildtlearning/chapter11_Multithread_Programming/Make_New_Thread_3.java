package ru.shildtlearning.chapter11_Multithread_Programming;

// Создаем второй поток через наследование от Thread
class NewThread2 extends Thread {

    NewThread2() { // Конструктор класса
        // Создать новый, второй поток
        super("Demo thread"); // Наследуем создание нового потока от Thread
        System.out.println("Дочерний поток: " + this);
    }

    // Это точка входа для второго потока
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException exc) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Завершение дочернего потока");
    }
}

public class Make_New_Thread_3 {
    public static void main(String[] args) {
        NewThread2 nt = new NewThread2(); // Создать новый поток
        nt.start(); // Запуск дочернего потока. Выполняется то, что описано в методе run() у дочернего потока
        try { // Запуск цикла для ГЛАВНОГО ПОТОКА
            for(int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exc) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }
}