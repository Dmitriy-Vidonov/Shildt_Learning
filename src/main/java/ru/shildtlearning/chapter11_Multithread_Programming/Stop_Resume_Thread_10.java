package ru.shildtlearning.chapter11_Multithread_Programming;


// Приостановка и возобновление потоков - пример
class NewThread1 implements Runnable {
    String name; // имя потока
    Thread t;
    boolean suspendFlag;
    NewThread1(String threadname) { // конструктор класса
        name = threadname;
        t = new Thread(this, name); // создаем поток для нашего экземпляра класса. ОН ЖЕ ЯВЛЯЕТСЯ ГЛАВНЫМ ПОТОКОМ ОБЪЕКТА
        // мы как бы говорим - создай новый объект класса Thread для нашего объекта класса NewThread1
        // Если бы нужно было создать например 2 потока у объекта типа NewThread1, то можно было бы объявить еще одно поле типа Thread
        // например задать Thread t1 и Thread t2 и в конструкторе создать 2 потока
        System.out.println("Новый поток: " + t);
        suspendFlag = false; // задаем флажок для управления состоянием потока
    }
    // Это точка входа для потока - что собственно говоря делает поток при вычислении
    public void run() { // этот метод будет запускаться через метод start() у потока obj.t.start()
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i); // name - у нас имя потока
                Thread.sleep(200); // задержка 200 мс
                synchronized (this) { // через synchronized(this) мы по сути говорим - что этот блок кода - синхронизирован
                    // этот while будет выполняться как синхронизированный, причем он сам внутри несинхронизированного цикла
                    // this - это указание на то, что код синхронизирован для объекта, внутри которого вызывается метод run()
                    // т.е. для вызывающего метод потока.
                    while (suspendFlag) {
                        wait(); // поток ожидает, пока его не вызовут к дальнейшей работе
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершается.");
    }
    synchronized void mysuspend() { // в конструкторе флажок стоял false, здесь мы его ставим true
        // в данном случае mysuspend дословно "моя приостановка", сменой флага мы меняем состояние потока
        suspendFlag = true;
    }
    synchronized void myresume() { // в данном случае это метод восстановления работы потока через работу с флажком
        // мы ставим флаг suspendFlag в положение false - по сути это дословно "флаг приостановки" - если он false, то поток запущен
        suspendFlag = false; // выставляем флажок как false
        notify(); // "пробуждаем" ожидающий поток (в состоянии wait) - а это реализация "пробуждения" потока
    }
}

class Stop_Resume_Thread_10 {
    public static void main(String[] args) {
        NewThread1 ob1 = new NewThread1("One");
        NewThread1 ob2 = new NewThread1("Two");
        ob1.t.start(); // запустили первый поток
        ob2.t.start(); // запустили второй поток
        try{
            Thread.sleep(1000); // подождать 1 секунду в ГЛАВНОМ ПОТОКЕ, не в объектах ob1 и ob2
            System.out.println("Состояние потока One: " + ob1.t.getState());
            ob1.mysuspend(); // у объекта ob1 ставим флажок в true - приостанавливаем выполнение потока
            System.out.println("Приостановка потока One");
            System.out.println("Состояние потока One: " + ob1.t.getState());
            Thread.sleep(1000); // ждем еще одну секунду в главном потоке
            ob1.myresume(); // возобновляем работу потока
            System.out.println("Возобновление потока One");
            System.out.println("Состояние потока One: " + ob1.t.getState());
            ob2.mysuspend(); // приостановили поток объекта ob2
            System.out.println("Приостановка потока Two");
            Thread.sleep(1000); // подождали 1000 мс в главном потоке
            ob2.myresume(); // возобновили работу 2-ого потока
            System.out.println("Возобновление потока Two");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван"); // обработали прерывание главного потока. try-catch для главного потока
        }

        // Ожидать завершения потоков
        try {
            System.out.println("Ожидание завершения потоков");
            ob1.t.join(); // текущий поток (главный) ждет - пока поток из ob1 не завершится
            ob2.t.join(); // аналогично
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван"); // текущий catch мы для главного потока и выполняем
        }
        System.out.println("Главный поток завершается.");
    }
}
