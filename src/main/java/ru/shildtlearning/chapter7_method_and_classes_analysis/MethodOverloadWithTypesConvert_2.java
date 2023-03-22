package ru.shildtlearning.chapter7_method_and_classes_analysis;

// При перегрузке применяется автоматическое преобразование типов
class OverloadTypes{
    void test(){
        System.out.println("Параметры отсутствуют");
    }

    // Перегрузить test() для двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегрузить test() для одного параметра типа double
    void test(double a){
        System.out.println("Внутри test(double) a: " + a);
    }
}

public class MethodOverloadWithTypesConvert_2 {
    public static void main(String[] args) {
        OverloadTypes ob = new OverloadTypes();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // будет вызываться test(double)
        ob.test(123.2); // будет вызываться test(double)
    }
}
