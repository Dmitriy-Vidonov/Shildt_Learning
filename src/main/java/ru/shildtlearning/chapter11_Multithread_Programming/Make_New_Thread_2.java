package ru.shildtlearning.chapter11_Multithread_Programming;

// Создание второго потока
class NewThread implements Runnable {
    Thread t; // создается ссылка типа Thread
    NewThread() { // Конструктор класса, внутри которого создаем новый объект Thread
        // Создать новый, второй поток
        t = new Thread(this, "Second thread"); // ссылаемся на текущий экземпляр класса
        // Thread(Runnable threadOb, String threadName) // тут threadOb - это по сути экземпляр класса, который реализует интерфейс Runnable
        System.out.println("Дочерний поток: " + t);
    }

    // Фабричный метод, создающий и запускающий поток
    public static NewThread createAndStart() {
        NewThread myThrd = new NewThread();
        myThrd.t.start();
        return myThrd;
    }

    // Создаем точку входа для второго потока
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);;
            }
        } catch (InterruptedException exc) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Завершение дочернего потока");
    }
}

public class Make_New_Thread_2 {
    public static void main(String[] args) {
        //Все что ниже - 2 строки - создание и запуск потока без фабричного метода
       // NewThread newT = new NewThread(); // создать новый поток согласно конструктору выше
       // newT.t.start(); // запускам run() из созданного потока - дочерний поток, НЕ ГЛАВНЫЙ - начинает свою работу
       NewThread nt = NewThread.createAndStart(); // Использование фабричного метода создания и запуска потока

        try {
            for(int i=5; i>0; i--) { // ЭТО РАБОТАЕМ С ГЛАВНЫМ ПОТОКОМ. В ПАРАЛЛЕЛЬ С НОВЫМ, СОЗДАННЫМ ВЫШЕ
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000); // sleep главного потока - 1000. sleep у дочернего потока - 500
                // Это создано из-за того, чтобы наглядно показать - главный поток должен завершаться последним
            }
        } catch(InterruptedException exc) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }
}
