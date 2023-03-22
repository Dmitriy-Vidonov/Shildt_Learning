package ru.shildtlearning.chapter10_Exceptions;

// ЭТА ПРОГРАММА С ОШИБКОЙ
class Wrong_Throws_Example_9 {
    static void throwOne() { // здесь не прописан throws с исключением, которое генерит код
        System.out.println("Внутри throwOne().");
        // throw new IllegalAccessException("демонстрация"); // на этом этапе будет ругаться сама среда разработки
    }
    public static void main1(String[] args) {
        throwOne();
    }
}

// КАК ИСПРАВИТЬ КОД ВЫШЕ
class Right_Throws_Example {
    static void throwOneR() throws IllegalAccessException{
        System.out.println("Внутри throwOne().");
        throw new IllegalAccessException("демонстрация");
    }
    public static void main(String[] args) {
        try {
            throwOneR();
        } catch (IllegalAccessException err) {
            System.out.println("Перехвачено " + err);
        }
    }
}