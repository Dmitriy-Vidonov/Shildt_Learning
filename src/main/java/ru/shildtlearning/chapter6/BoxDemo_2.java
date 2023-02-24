package ru.shildtlearning.chapter6;

class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo_2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol1;
        double vol2;

        // Работа с переменными экземпляра класса mybox
        mybox1.depth = 10;
        mybox1.width = 10;
        mybox1.height = 10;

        mybox2.depth = 110;
        mybox2.width = 110;
        mybox2.height = 110;

        //Вычислить объем коробки
        vol1 = mybox1.depth * mybox1.height * mybox1.width;
        vol2 = mybox2.depth * mybox2.width * mybox2.height;

        System.out.println("объем равен = " + vol1);
        System.out.println("Объем2 равен = " + vol2);
    }
}
