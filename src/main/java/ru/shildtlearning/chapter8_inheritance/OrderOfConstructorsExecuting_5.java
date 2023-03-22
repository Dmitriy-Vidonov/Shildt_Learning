package ru.shildtlearning.chapter8_inheritance;

// Демонстрация выполнения конструкторов
// Создать суперкласс
class A_Exec {
    A_Exec() {
        System.out.println("Внутри конструктора A_Exec.");
    }
}

// Создать подкласс путем расширения класса A_Exec
class B_Exec extends A_Exec {
    B_Exec() {
        System.out.println("Внутри конструктора B_Exec.");
    }
}

// Создать еще один подкласс путем расширения класса B_Exec
class C_Exec extends B_Exec {
    C_Exec() {
        System.out.println("Внутри конструктора C_Exec.");
    }
}

class OrderOfConstructorsExecuting_5 {
    public static void main(String[] args) {
        C_Exec ob = new C_Exec();
    }
}

// Исполнение конструкторов будет происходить "сверху вниз", от самого "старшего" к самому "младшему"
// Это логично, т.к. в каждом классе, который наследует суперкласс - сначала должен выполнится
// конструктор суперкласса:
/*
Внутри конструктора A_Exec.
Внутри конструктора B_Exec.
Внутри конструктора C_Exec.
 */