package ru.shildtlearning.chapter6_enteringclasses;

// Здесь volume() возвращает объем коробки
class BoxReturn{
    double width;
    double height;
    double depth;

    // Вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }
}

class BoxReturnValues_4 {
    public static void main(String[] args) {
        BoxReturn mybox1 = new BoxReturn();
        BoxReturn mybox2 = new BoxReturn();

        // Задаем значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

        // Задаем значения переменным экземпляра mybox2
        mybox2.width = 50;
        mybox2.height = 60;
        mybox2.depth = 70;

        // Получить объем первой коробки
        double vol1 = mybox1.volume();
        System.out.println("Объем 1 равен: " + vol1);

        // Получить объем второй коробки
        double vol2 = mybox2.volume();
        System.out.println("Объем 2 равен: " + vol2);
    }
}
