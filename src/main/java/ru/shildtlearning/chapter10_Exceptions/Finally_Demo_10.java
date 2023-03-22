package ru.shildtlearning.chapter10_Exceptions;

// Демонстрация применения finally
class Finally_Demo_10 {
    // Сгенерировать исключение внутри метода
    static void processA() {
        try {
            System.out.println("Внутри метода processA()");
            throw new RuntimeException("Демонстрация исключения"); // Преждевременное прерывание метода исключением
        } finally { // выполняем finally при выходе из метода
            System.out.println("Блок finally метода processA()");
        }
    }
    // Возвратить управление изнутри блока try
    static void processB() {
        try {
            System.out.println("Внутри метода processB()");
            return;
        } finally {
            System.out.println("Блок finally метода processB()");
        }
    }
    // Выполнить try обычным образом
    static void processC() {
        try {
            System.out.println("Внутри метода processC()");
        } finally {
            System.out.println("Блок finally метода processC()");
        }
    }

    public static void main(String[] args) {
        try {
            processA();
        } catch (Exception err) {
            System.out.println("Исключение перехвачено");
        }
        processB();
        processC();
    }
}
