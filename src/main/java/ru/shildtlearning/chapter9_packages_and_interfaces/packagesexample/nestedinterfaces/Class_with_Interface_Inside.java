package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.nestedinterfaces;

// Пример вложенного интерфейса
class Class_with_Interface_Inside { // класс Class_with_Interface_Inside содержит член-интерфейс
    // вложенный интерфейс
    public interface NestedIF { // член-интерфейс объявлен как public
        boolean isNotNegative(int x);
    }
}

// Класс B реализует вложенный интерфейс
class B implements Class_with_Interface_Inside.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

// Демонстрационный класс
class NestedIFDemo {
    public static void main(String[] args) {
        // использовать ссылку на вложенный интерфейс
        Class_with_Interface_Inside.NestedIF nif = new B(); // ссылочная переменная типа "вложенный интерфейс"
        // ссылается на объект класса, реализующего интерфейс
        // так можно делать, т.к. класс B реализует интерфейс

        if(nif.isNotNegative(10))
            System.out.println("10 не отрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("Это выводиться не будет");
    }
}