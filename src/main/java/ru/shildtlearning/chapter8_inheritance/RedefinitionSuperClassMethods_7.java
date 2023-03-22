package ru.shildtlearning.chapter8_inheritance;

// Переопределение методов в иерархии классов
class A_redef {
    int i, j;
    A_redef(int a, int b) {
        i = a;
        j = b;
    }
    // Отобразить значения i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B_redef extends A_redef {
    int k;
    B_redef(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // Отобразить k - переопределяет show() в A_Exec
    void show() { // такое же название и тоже без аргументов и тип тот же возвращаемый
        System.out.println("k: " + k);
    }
}

class RedefinitionSuperClassMethods_6 {
    public static void main(String[] args) {
        B_redef subOb = new B_redef(1, 2, 3);
        subOb.show(); // вызовется show() из B_redef, скрывая версию A_redef  - k: 3
    }
}
