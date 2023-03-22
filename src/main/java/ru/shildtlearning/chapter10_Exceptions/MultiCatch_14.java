package ru.shildtlearning.chapter10_Exceptions;

// Демонстрация средства множественного наследования
class MultiCatch_14 {
    public static void main(String[] args) {
        int a=10, b=0;
        int[] vals = {1,2,3};
        try {
            int result = a / b; // сгенерировать исключение ArithmeticException
            // vals[10] = 19; // сгенерировать исключение ArrayIndexOutOfBoundsException
            // следующая конструкция catch перехватывает оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException err) {
            System.out.println("Перехвачено исключение: " + err);
        }
        System.out.println("Блок после множественного перехвата.");
    }
}
