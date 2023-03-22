package ru.shildtlearning.chapter8_inheritance;

// Использование super для преодоления сокрытия имен
class A1 {
    int i;
}

// Создаем подкласс путем расширения класса А1
class B1 extends A1 {
    int i; // этот член скрывает i в A1, т.е. в суперклассе
    B1 (int a, int b) {
        super.i = a; // берем i из А1, суперкласса
        i = b; // берем локальный i
    }

    void show() {
        System.out.println("i в суперклассе - " + super.i);
        System.out.println("i в подклассе - " + i);
    }
}

class SecondFormOfSuper_3 {
    public static void main(String[] args) {
        B1 subOb = new B1(1, 2);

        subOb.show(); // i в суперклассе - 1, i в подклассе - 2
    }
}
