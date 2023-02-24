package ru.shildtlearning.chapter7;

// Пример перегрузки конструктора
class Box{
    double width;
    double height;
    double depth;

    // Это конструктор для Box с указанием всех размеров
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор для создания кубика
    Box(double dim){
        height = width = depth = dim;
    }

    // Конструктор без указания размера
    Box(){
        height = width = depth = -1;
    }

    // Метод вычисления объема
    double volume(){
        return width * height * depth;
    }
}

// Тестирование перегруженных конструкторов
class ConstructorOverload_3 {
    public static void main(String[] args) {
        Box box1 = new Box(); // Конструктор без параметро
        Box box2 = new Box(10); // Конструктор для создания кубика
        Box box3 = new Box(10, 20, 30); // Конструктор для коробки с указанием всех размеров

        System.out.println("box1 volume = " + box1.volume()); // -1.0
        System.out.println("box2 volume = " + box2.volume()); // 1000.0
        System.out.println("box3 volume = " + box3.volume()); // 6000.0
    }
}
