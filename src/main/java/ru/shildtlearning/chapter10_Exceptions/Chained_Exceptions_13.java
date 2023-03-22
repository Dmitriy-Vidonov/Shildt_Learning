package ru.shildtlearning.chapter10_Exceptions;

// Демонстрация работы сцепленных исключений
class Chained_Exceptions_13 {
    static void demoprocess() {
        // Создать исключение
        NullPointerException err = new NullPointerException("Верхний уровень");
        // Добавить причину
        err.initCause(new ArithmeticException("Первоначальная причина")); // мы прописываем самостоятельно
        // мы как бы к объекту err цепляем причину - ArithmeticException
        throw err; // выбрасывается NullPointerException
    }
    public static void main(String[] args) {
        try {
            demoprocess();
        } catch (NullPointerException err) {
            // Отобразить исключение верхнего уровня
            System.out.println("Перехвачено: " + err); // отобразили объект err
            // Отобразить исключение-причину
            System.out.println("Первоначальная причина: " + err.getCause()); // вызвали сцепленную причину от err
        }
    }
}
