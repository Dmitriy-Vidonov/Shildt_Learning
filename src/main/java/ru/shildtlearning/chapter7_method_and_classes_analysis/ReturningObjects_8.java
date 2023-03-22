package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Возвращение объекта
class TestReturn {
    int a;

    TestReturn(int i) {
        a = i;
    }

    TestReturn IncrByTen(){ // метод возвращает объект типа TestReturn
        TestReturn temp = new TestReturn(a + 10); // создаем объект с увеличенной a
        return temp;
    }
}

class ReturningObjects_8 {
    public static void main(String[] args) {
        TestReturn ob1 = new TestReturn(2); // Создаем новый объект
        TestReturn ob2; // Создаем переменную типа TestReturn

        ob2 = ob1.IncrByTen(); // указываем ссылку на измененный объект ob1

        System.out.println("ob1.a = " + ob1.a); // 2
        System.out.println("ob2.a = " + ob2.a); // 12

        ob2 = ob2.IncrByTen();
        System.out.println("ob2.a после второго увеличения = " + ob2.a); // 22
    }
}
