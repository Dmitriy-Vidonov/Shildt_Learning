package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Пример определения внутреннего класса внутри блока for
class OuterCl {
    int outer_x = 100;

    void test() {
        for(int i=0; i<10; i++) {
            class Inner {
                void display() {
                    System.out.println("display(): outer_x = " + outer_x);
                }
            }
            Inner inner_obj = new Inner();
            inner_obj.display();
        }
    }
}
class InnerClassInsideFor_15 {
    public static void main(String[] args) {
        OuterCl outer_obj = new OuterCl();
        outer_obj.test();
    }
}
