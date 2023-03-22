package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Пример вызова static метода
class StaticDemo{
    static int a = 45;
    static int b = 100;

    static void callme() {
        System.out.println("a = " + a);
    }
}

class HowToCallStatic_13 {
    public static void main(String[] args) {
        StaticDemo.callme(); // Вызов статического метода из другого класса
        System.out.println("b = " + StaticDemo.b);
    }
}
