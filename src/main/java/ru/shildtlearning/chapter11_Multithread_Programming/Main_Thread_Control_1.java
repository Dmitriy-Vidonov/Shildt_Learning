package ru.shildtlearning.chapter11_Multithread_Programming;

// Демонстрация управления главным потоком
class Main_Thread_Control_1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // передали в t ссылку на главный поток
        System.out.println("Текущий поток - " + t); // Текущий поток - Thread[#1,main,5,main]

        // Изменим имя потока
        t.setName("My own thread"); // метод setName - член класса Thread
        // вот общие формы методов установления и получения имени потока:
        // final void setName (String threadName);
        // final String getName();

        System.out.println("Новое имя потока - " + t); // Новое имя потока - Thread[#1,My own thread,5,main]
        // My own thread - имя потока, 5 - приоритет, main - имя группы
        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000); // приостановка выполнения потока на 1000 мс = 1 сек
                // общий вид метода sleep - static void sleep (loпg milliseconds) throws InterruptedExceptioп
                // есть еще вторая форма метода - static void sleep (loпg milliseconds, int nanoseconds) throws InterruptedExceptioп
            }
        } catch (InterruptedException err) { // это исключение может сгенерировать метод sleep(), если спящий поток прервут
            System.out.println("Главный прерван");
        }
    }
}
