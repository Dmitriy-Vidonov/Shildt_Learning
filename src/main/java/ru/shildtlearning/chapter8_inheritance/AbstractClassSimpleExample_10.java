package ru.shildtlearning.chapter8_inheritance;

// Простая демонстрация применения abstract
abstract class A_abst {
    abstract void callme();

    // Конкретные, но не статические методы в абстрактных классах разрешены
    void callmetoo() {
        System.out.println("Это конкретный метод абстрактного класса");
    }
}

class B_sub extends A_abst {
    void callme() {
        System.out.println("Реализация метода callme() в подклассе B_sub");
    }
}

class AbstractClassSimpleExample_10 {
    public static void main(String[] args) {
        B_sub obj_B = new B_sub();

        obj_B.callme(); // вызываем собственный метод подкласса
        obj_B.callmetoo(); // вызываем метод, унаследованный от суперкласса
    }
}

/*
Реализация метода callme() в подклассе B_sub
Это конкретный метод абстрактного класса
*/