package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Примитивные типы передаются по значению
class TestArgs {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class ArgumentsTransition_6 {
    public static void main(String[] args) {
        TestArgs ob = new TestArgs();

        int a = 15, b = 20;
        System.out.println("a и b перед вызовом: " + a + " " + b); // 15 20

        ob.meth(a, b);
        System.out.println("a и b после вызова: " + a + " " + b); // 15 20
    }
}
