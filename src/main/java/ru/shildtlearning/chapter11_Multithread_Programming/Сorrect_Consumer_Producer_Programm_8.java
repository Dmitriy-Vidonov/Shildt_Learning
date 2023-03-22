package ru.shildtlearning.chapter11_Multithread_Programming;

// Реализация производителя и потребителя
class Queue { // Queue - очередь, которую хотим синхронизировать
    int n;
    boolean valueSet = false;
    synchronized int get() {
        while (!valueSet) {
            try {
                wait(); // приостанавливаем выполнение метода get() пока объект Producer не уведомит нас о готовности данных
            } catch (InterruptedException e) {
                System.out.println("Перехвачено исключение InterruptedException");
            }
        }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify(); // как данные получили - вызываем notify(), сообщая объекту Producer что в очередь можно поместить доп данные
        return n;
    }
    synchronized void put(int n) {
        while (valueSet) {
            try {
                wait(); // ждем, пока объект Consumer не удалит элемент из очереди
            } catch (InterruptedException e) {
                System.out.println("Перехвачено исключение InterruptedException");
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer implements Runnable { // Producer - потоковый объект, создает записи в очереди
    Queue q;
    Thread t;
    Producer(Queue q) { // конструктор Producer - получает на вход объект класса Queue
        this.q = q;
        t = new Thread(this, "Производитель");
    }
    public void run() { // метод, в котором описывается работа потока
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable { // Consumer - потоковый объект, потребляет записи очереди
    Queue q;
    Thread t;

    Consumer(Queue q) {
        this.q = q;
        t = new Thread(this, "Потребитель");
    }
    public void run() {
        while(true) {
            q.get();
        }
    }
}

public class Сorrect_Consumer_Producer_Programm_8 {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer prod = new Producer(q);
        Consumer cons = new Consumer(q);

        // Запустить потоки
        prod.t.start();
        cons.t.start();

        System.out.println("Нажмите Ctrl-C чтобы остановить програпмму.");
    }
}
