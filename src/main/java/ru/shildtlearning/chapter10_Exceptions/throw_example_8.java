package ru.shildtlearning.chapter10_Exceptions;

// Демонстрация применения throw
class throw_example_8 {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрационный объект исключения через throw"); // *exception_msg
        }catch (NullPointerException err) {
            System.out.println("Исключение перехвачено внутри demoproc()"); // *first
            System.out.println(err.getMessage());
            throw err; // повторно сгенерировать исключение *second
        }
    }
    public static void main(String[] args) {
        try {
            demoproc(); // здесь мы увидим результат работы метода, который выкинет исключение *first
        } catch (NullPointerException e) {
            System.out.println("Повторно перехвачено: " + e); // перехватим повторно сгенерированное *second,
            // у которого будет сообщение об ошибке *exception_msg
        }
    }
}