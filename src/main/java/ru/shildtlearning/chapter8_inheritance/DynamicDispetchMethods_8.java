package ru.shildtlearning.chapter8_inheritance;

// Пример динамической диспетчеризации методов
class A_disp { // суперкласс
    void callme() {
        System.out.println("Внутри метода callme() класса A_disp");
    }
}

class B_disp extends A_disp { // подкласс от суперкласса A_disp
    // Переопределить метод callme()
    void callme() {
        System.out.println("Внутри метода callme() класса B_disp");
    }
}

class C_disp extends A_disp { // еще один подкласс от суперкласса A_disp
    // Переопределить метод callme()
    void callme() {
        System.out.println("Внутри метода callme() класса C_disp");
    }
}

class DynamicDispetchMethods_8 {
    public static void main(String[] args) {
        A_disp obj_A = new A_disp(); // объект типа A_disp
        B_disp obj_B = new B_disp(); // объект типа B_disp
        C_disp obj_C = new C_disp(); // объект типа C_disp

        A_disp link_obj; // получить ссылку типа A_disp

        link_obj = obj_A; // ссылка ведет на объект A_disp
        link_obj.callme(); // вызывается версия callme() из класса A_disp

        link_obj = obj_B; // ссылка теперь ведет на объект B_disp
        link_obj.callme(); // вызывается версия callme() из класса B_disp

        link_obj = obj_C; // ссылка теперь ведет на объект C_disp
        link_obj.callme(); // вызывается версия callme() из класса C_disp
    }
}

/*
Внутри метода callme() класса A_disp
Внутри метода callme() класса B_disp
Внутри метода callme() класса C_disp
*/