package ru.shildtlearning.chapter6_enteringclasses;

// Здесь мы используем параметризованный метод
class BoxParams {
    double width;
    double height;
    double depth;

    // Вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }

    // Установить размеры коробки
    void SetBoxSizes (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}


class MethodWithParams_5 {
    public static void main(String[] args) {
        BoxParams box1 = new BoxParams();
        BoxParams box2 = new BoxParams();

        // Инициализировать объекты коробок
        box1.SetBoxSizes(10, 20, 30);
        box2.SetBoxSizes(589, 43, 54);

        // Вывести объем первой коробки
        System.out.println("Объем первой коробки = " + box1.volume());

        // Вывести объем второй коробки
        System.out.println("Объем второй коробки = " + box2.volume());
    }
}
