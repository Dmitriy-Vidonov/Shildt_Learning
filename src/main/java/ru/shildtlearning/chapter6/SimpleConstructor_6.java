package ru.shildtlearning.chapter6;


// Создаем Box с простым конструктором для инициализации размеров коробки
class BoxConstruct{
    double width;
    double height;
    double depth;

    // Это конструктор для BoxConstruct
    BoxConstruct() {
        System.out.println("Конструирование BoxConstruct");
        height = 10;
        width = 10;
        depth = 10;
    }

    // Вычислить и вернуть объем
    double volume(){
        return width * height * depth;
    }
}

class SimpleConstructor_6 {
    public static void main(String[] args) {
        // Объявить, разместить в памяти и инициализировать объекты BoxConstruct
        BoxConstruct box1 = new BoxConstruct();
        BoxConstruct box2 = new BoxConstruct();

        // Вывести объемы коробок
        System.out.println("Объем 1-й коробки: " + box1.volume());
        System.out.println("Объем 2-й коробки: " + box2.volume());
    }
}
