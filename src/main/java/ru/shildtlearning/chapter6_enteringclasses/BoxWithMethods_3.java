package ru.shildtlearning.chapter6_enteringclasses;

//Здесь внутрь класса BoxMeth мы добавим метод
class BoxMeth {
    double width;
    double height;
    double depth;

    // Отобразить объем коробки
    void volume() {
        System.out.print("Объем равен: ");
        System.out.println(width * height * depth);
    }
}

class BoxWithMethods_3 {
    public static void main(String[] args) {
        BoxMeth mybox1 = new BoxMeth();
        BoxMeth mybox2 = new BoxMeth();

        // Задаем значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 30;

        // Задаем значения переменным экземпляра mybox2
        mybox2.width = 50;
        mybox2.height = 60;
        mybox2.depth = 70;

        // Показать объем первой коробки
        mybox1.volume();

        // Показать объем второй коробки
        mybox2.volume();
    }
}
