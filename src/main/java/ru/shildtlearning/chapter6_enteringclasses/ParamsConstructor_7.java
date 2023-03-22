package ru.shildtlearning.chapter6_enteringclasses;


// Задаем параметризованный конструктор
class BoxParamsConst{
    double width;
    double height;
    double depth;

    // Конструктор с параметрами
    BoxParamsConst(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Вычислить и вернуть объем
    double volume(){
        return width * height * depth;
    }
}
class ParamsConstruct_7 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты BoxConstruct
        BoxParamsConst box1 = new BoxParamsConst(10, 65, 43);
        BoxParamsConst box2 = new BoxParamsConst(56, 67, 6);

        // Вывести объемы коробок
        System.out.println("Объем 1-й коробки: " + box1.volume());
        System.out.println("Объем 2-й коробки: " + box2.volume());
    }
}
