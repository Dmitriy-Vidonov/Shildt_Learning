package ru.shildtlearning.chapter11_Multithread_Programming;

// В этой программе используется блок synchronized
class Callme2 {
    void call(String msg){ // влепили скобочку с сообщением
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000); // ждем 1 секунду. Никакого отдельного потока нет. Работа с главным потоком
        } catch (InterruptedException e) {
            System.out.println("Прерван"); // если прервался поток - вывод сообщения
        }
        System.out.println("]"); // если не прервался - выведем вторую скобочку
    }
}

class Caller2 implements Runnable { // здесь уже будем создавать объекты потоков, имплементируя Runnable
    String msg;
    Callme2 target; // объект класса Callme2
    Thread t; // поток

    public Caller2(Callme2 targ, String s) { // конструктор класса Caller2, принимающий на вход объект Caller2 и строку
        target = targ;
        msg = s;
        t = new Thread(this); // при создании объекта класса Caller2 создается новый поток для этого объекта
    }
    // Синхронизированные вызовы call()
    public void run() {
        synchronized (target) { // блок synchronized для объекта класса Callme2 - target
            target.call(msg); // вызов метода call из объекта класса Callme2 - target - синхронизирован
        }
    }
}
class Synchronized_block_example_7 {
    public static void main(String[] args) {
        Callme2 target = new Callme2(); // создаем объект класса Callme2
        Caller2 ob1 = new Caller2(target, "Hello"); //создаем новый объект типа Caller2
                                                       //со ссылкой на объект типа Callme2 - target и сообщением "Hello"
        Caller2 ob2 = new Caller2(target, "Synchronized"); // ссылка на тот же объект, но передаем другое слово
        Caller2 ob3 = new Caller2(target, "World"); // снова ссылка на тот же объект, но еще другое слово
        // ПО ИТОГУ ВЫШЕ МЫ ТРЕМЯ ОБЪЕКТАМИ КЛАССА Caller2 ПЫТАЕМСЯ ВЫЗВАТЬ МЕТОД call(msg) ОДНОГО И ТОГО ЖЕ ОБЪЕКТА
        // Т.К. МЕТОД call() В БЛОКЕ synchronized - ПОТОКИ БУДУТ ИДТИ ЧЕРЕЗ МОНИТОР - НЕ БОЛЕЕ ОДНОГО ЗА РАЗ
        // ИНАЧЕ ВОЗНИКЛА БЫ "ГОНКА ЗА РЕСУРСЫ"

        // Запустить потоки
        ob1.t.start(); // метод start() не описан в классе Caller2, но он вызывается через t - объект типа Thread
        // а у класса Thread метод start() запускает на выполнение то, что определено в классе Caller2 в методе run()
        ob2.t.start();
        ob3.t.start();

        // Ожидать окончания работы потоков
        try { // метод join() может выкинуть исключение, поэтому все в блоке try-catch
            ob1.t.join(); // ожидаем завершения потока 1
            ob2.t.join(); // ожидаем завершения потока 2
            ob3.t.join(); // ожидаем завершения потока 3
        } catch (InterruptedException e) {
            System.out.println("Прерван");
        }
    }
}
