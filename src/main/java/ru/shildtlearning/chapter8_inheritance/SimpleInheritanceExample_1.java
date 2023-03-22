package ru.shildtlearning.chapter8_inheritance;

// Простой пример наследования

// Создаем суперкласс
class A {
    int I, J;

    void showIJ() {
        System.out.println("I и J: " + I + " " + J);
    }
}

// Создать подкласс путем расширения класса A
class B extends A {
    int K;

    void showK() {
        System.out.println("K: " + K);
    }

    void sum() {
        System.out.println("I + J + K = " + (I + J + K));
    }
}


class C extends B {
    int H;

    void showH() {
        System.out.println("H from C = " + H);
    }

    void helloC() {
        System.out.println("This message is for C class!");
    }
}

class SimpleInheritanceExample_1 {
    public static void main(String[] args) {
        A superObj = new A();
        B subObj = new B();
        C subsubObj = new C();

        // Суперкласс можно использовать сам по себе
        superObj.I = 25;
        superObj.J = 35;
        System.out.println("Содержимое superObj: ");
        superObj.showIJ();
        System.out.println();

        // Подкласс имеет доступ ко всем ОТКРЫТЫМ членам своего суперкласса - то есть у него такие же члены
        subObj.I = 100;
        subObj.J = 45;
        subObj.K = 15;
        System.out.println("Содерижмое subObj: ");
        subObj.showIJ();
        subObj.showK();
        System.out.println();

        System.out.println("Сумма I, J, K в subObj: ");
        subObj.sum();
        System.out.println();

        subsubObj.H = 300;
        subsubObj.I = 560;
        subsubObj.K = 456;
        subsubObj.J = 5;
        System.out.println("Сумма H, I, K, J в subsubObj = " + (subsubObj.H + subsubObj.I + subsubObj.J + subsubObj.K));
        subsubObj.helloC();
    }
}
