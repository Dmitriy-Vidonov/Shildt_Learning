package ru.shildtlearning.chapter7_method_and_classes_analysis;


// Класс BoxInit позволяет создать объект такой же, как уже существующий
class BoxInit {
    double width;
    double height;
    double depth;

    // Конструктор из класса BoxInit принимает на вход объект своего же класса. Т.е. мы
    // из объекта вызовем этот конструктор и создадим такой же объект
    BoxInit(BoxInit ob) { // ob  - уже готовый объект, который мы подаем на вход при создании нового
        // т.е. поля объекта ob нам уже известны и мы с них снимаем как бы копию в наш новый объект
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый при указании всех размеров
    BoxInit(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый если размеры вообще не указаны
    BoxInit() {
        width = height = depth = -1;
    }

    // Конструктор для создания объекта - кубика по одной стороне
    BoxInit(double dim) {
        width = height = depth = dim;
    }

    // Вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }
}

class SelfInitialisation_InClasses_5 {
    public static void main(String[] args) {
        // Создать объекты коробок с применением различных конструкторов
        BoxInit mybox1 = new BoxInit(); // коробка без параметров, со стороной -1
        BoxInit mybox2 = new BoxInit(10, 23, 55); // коробка, в которой мы задали сразу все стороны
        BoxInit mybox3 = new BoxInit(3); // кубик, созданный по одной стороне
        BoxInit mybox4 = new BoxInit(mybox3); // копия кубика

        // Выводы объемов коробок
        System.out.println("Объем коробки без параметров: " + mybox1.volume());
        System.out.println("Объем коробки со всеми сторонами: " + mybox2.volume());
        System.out.println("Объем кубика: " + mybox3.volume());
        System.out.println("Объем копии кубика: " + mybox4.volume());
    }
}
