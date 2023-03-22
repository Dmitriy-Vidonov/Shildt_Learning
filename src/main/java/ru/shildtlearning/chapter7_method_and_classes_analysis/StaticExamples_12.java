package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Демонстрация применения статических переменных, методов и блока static
class StaticExamples_12 {
    static int a = 3;
    static int b;

    public static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("Инициализация в статическом блоке");
        b = a * 4;
    }
    public static void main(String[] args) {
        meth(42);
    }
}
