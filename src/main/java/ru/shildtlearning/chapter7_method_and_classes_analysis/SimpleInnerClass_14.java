package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Демонстрация работы с внутренним классом
class Outer {
    int outer_x = 100;
    void test() {
        Inner inner_obj = new Inner();
        inner_obj.display();

    }
    // Внутренний класс
    class Inner{
        void display() {
            System.out.println("display(): outer_x = " + outer_x);
        }
    }
}

class SimpleInnerClass_14 {
    public static void main(String[] args) {
        Outer outer_obj = new Outer();
        outer_obj.test();
    }
}
