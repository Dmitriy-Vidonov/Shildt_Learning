package ru.shildtlearning.chapter8_inheritance;

// Пример использования final для предотвращения переопределения
class A_fin {
    final void meth() { // метод объявлен как final - его нельзя переопределять
        System.out.println("Это метод final.");
    }
}

class B_fin extends A_fin {
    // void meth() { // ОШИБКА! Переопределять нельзя!
    //    System.out.println("Не разрешено!");
    //}
}

class FinalAvoidRedefenition_12 {

}
