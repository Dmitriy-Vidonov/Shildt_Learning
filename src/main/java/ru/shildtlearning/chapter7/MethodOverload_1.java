package ru.shildtlearning.chapter7;

// Демонстрация перегрузки методов
class OverloadDemo{
    void test(){
        System.out.println("Параметры отсутствуют");
    }

    // Перегрузить метод для целочисленного параметра
    void test(int a){
        System.out.println("Перегруженный метод для int: " + a);
    }

    // Перегрузить методля для строки
    void test(String str){
        System.out.println("Перегруженный метод для String: " + str);
    }

    // Перегрузить метод для двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("Перегруженный метод для двух int: " + a + " и " + b);
    }

    // Перегруженный метод для одного типа double
    void test(double a) {
        System.out.println("Перегруженный метод для одного double: " + a * a);
    }
}
class MethodOverload_1 {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();

        // Вызвать все версии test()
        ob.test();
        ob.test(10);
        ob.test("некая строчечка");
        ob.test(15, 20);
        ob.test(10.25);
    }
}
