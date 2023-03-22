package ru.shildtlearning.chapter8_inheritance;

// Методы с отличающимися сигнатурами типов - являются ПЕРЕГРУЖЕННЫМИ, не переопределенными
class A_reload {
    int i, j;
    A_reload(int a, int b) {
        i = a;
        j = b;
    }
    // Отобразить значения i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B_reload extends A_reload {
    int k;
    B_reload(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // перегрузить show()
    void show(String str) { // такое же название, но иная сигнатура типов - происходит перегрузка
        System.out.println(str + k);
    }
}

class MethodsReloading_6 {
    public static void main(String[] args) {
        B_reload subOb = new B_reload(234, 3, 35);
        subOb.show(); // вызовется show() из A_reload по механизму наследования
        subOb.show("Сообщение: "); // вызовется show(String str) из B_reload
    }
}
