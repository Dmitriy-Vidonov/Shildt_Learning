package ru.shildtlearning.chapter8_inheritance;

// Используем наследование для расширения класса Box
class Box {
    // Делаем поля суперкласса закрытыми, т.к. в подклассе вызов конструктора идет через super
    private double width;
    private double height;
    private double depth;

    // Конструктор, применяемый для клонирования объекта
    Box (Box ob) { // передаем объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый в случае указания всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор для случаев когда размеры вообще не указаны
    Box() {
        width = height = depth = -1;
    }

    // Конструктор для создания кубика
    Box(double dim) {
        width = height = depth = dim;
    }

    // Вычислить и вернуть объем
    double volume() {
        return height * width * depth;
    }
}

// Класс BoxWeight наследуется от класса Box с целью включения члена weight
// При этом все члены суперкласса инициализируются с применением super
class BoxWeight extends Box {
    double weight; // вес коробки

    // Конструктор, применяемый для клонирования объекта
    BoxWeight(BoxWeight ob) { // передаем объект конструктору
        super(ob); // а здесь конструктору суперкласса передается объект BoxWeight
        weight = ob.weight;
    }

    // Конструктор, используемый для указания всех размеров
    BoxWeight(double w, double h, double d, double m) {
        //width = w;
        //height = h;
        //depth = d;
        // вместо строчек выше - правильнее инициализировать поля при помощи super()
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    // Стандартный конструктор, когда размеры не заданы
    BoxWeight() {
        super(); // вызов конструктора суперкласса когда размеры не заданы
        weight = -1;
    }

    // Конструктор для создания кубика
    BoxWeight(double dim, double m){
        super(dim); // конструктор для кубика из суперкласса
        weight = m;
    }
}

class MoreComplexInheritance_2 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(12,23,34,53);
        BoxWeight mybox2 = new BoxWeight(123, 34,45,56);
        BoxWeight mybox3 = new BoxWeight(); // стандартный, без указания размеров
        BoxWeight mycube = new BoxWeight(40, 3400);

        System.out.println("Объем mybox1 = " + mybox1.volume());
        System.out.println("Вес mybox1 = " + mybox1.weight);
        System.out.println();

        System.out.println("Объем mybox2 = " + mybox2.volume());
        System.out.println("Вес mybox2 = " + mybox2.weight);
        System.out.println();

        System.out.println("Объем mybox3 = " + mybox3.volume());
        System.out.println("Вес mybox3 = " + mybox3.weight);
        System.out.println();

        System.out.println("Объем mycube = " + mycube.volume());
        System.out.println("Вес mycube = " + mycube.weight);
        System.out.println();
    }
}
