package ru.shildtlearning.chapter8_inheritance;

// Расширение класса BoxWeight с целью включения стоимости доставки

// Начать с BoxMulti
class BoxMulti {
    private double width;
    private double height;
    private double depth;

    // Конструктор для клонирования объекта
    BoxMulti(BoxMulti ob) { // Передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор для случая указания всех размеров
    BoxMulti(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор для случаев, когда размеры вообще не указаны
    BoxMulti() {
        height = width = depth = -1;
    }

    // Конструктор для создания кубика
    BoxMulti(double len){
        width = height = depth = len;
    }

    // Вычислить и вернуть объем
    double volume() {
        return height * width * depth;
    }
}

// Добавить вес
class BoxWeightMulti extends BoxMulti {
    double weight; // вес коробки

    // Конструктор, применяемый при клонировании объекта
    BoxWeightMulti(BoxWeightMulti ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // Конструктор, используемый в случае указания всех параметров
    BoxWeightMulti (double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // Конструктор для случая отсутствия параметров
    BoxWeightMulti() {
        super();
        weight = -1;
    }

    // Конструктор для кубика
    BoxWeightMulti(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавить стоимость доставки
class Shipment extends BoxWeightMulti {
    double cost;

    // Конструктор, применяемый при клонировании объекта
    Shipment(Shipment ob) { // передать объект конструктору
        super(ob);
        cost = ob.cost;
    }

    // Конструктор для случая указания всех размеров
    Shipment(double w, double h, double d, double m, double c) {
        super (w, h, d, m);
        cost = c;
    }

    // Стандартный конструктор
    Shipment() {
        super();
        cost = -1;
    }

    // Конструктор для кубика
    Shipment (double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class MultiLevelHierarchy_4 {
    public static void main(String[] args) {
        Shipment shipm1 = new Shipment(123, 3, 34, 45, 45);
        Shipment shipm2 = new Shipment(34, 345,78,89,6);

        System.out.println("Объем shipm1 = " + shipm1.volume());
        System.out.println("Вес shipm1 = " + shipm1.weight);
        System.out.println("Стоимость shipm1 = " + shipm1.cost);
        System.out.println();

        System.out.println("Объем shipm2 = " + shipm2.volume());
        System.out.println("Вес shipm2 = " + shipm2.weight);
        System.out.println("Стоимость shipm2 = " + shipm2.cost);
        System.out.println();
    }
}
