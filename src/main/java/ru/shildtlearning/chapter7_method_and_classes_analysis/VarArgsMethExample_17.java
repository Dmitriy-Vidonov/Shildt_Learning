package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Демонстрация использования аргументов переменной длины
class VarArgsMethExample_17 {
    static void vaTest(int ... v) {
        System.out.println("Число аргументов: " + v.length + " Содержимое: ");
        for(int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Вызываем vaTest c любым числом аргументов
        vaTest();
        vaTest(10);
        vaTest(10, 3, 4, 545);
    }
}
