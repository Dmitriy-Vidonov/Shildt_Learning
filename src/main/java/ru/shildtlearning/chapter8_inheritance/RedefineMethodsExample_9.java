package ru.shildtlearning.chapter8_inheritance;

// Использование полиморфизма во время выполнения
class Figure { // суперкласс фигура
    double dim1;
    double dim2;

    Figure(double x, double y) {
        dim1 = x;
        dim2 = y;
    }
    double area() {
        System.out.println("Площадь для Figure не определена.");
        return 0;
    }
}

class Rectangle extends Figure { // создаем подкласс
    Rectangle(double x, double y) {
        super(x, y); // в конструктор, унаследованный от суперкласса - передаем x и y
    }
    // Переопределить area() для прямоугольника
    double area() {
        System.out.println("Внутри area() для Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure { // наследуем еще один подкласс
    Triangle(double x, double y) {
        super(x, y);
    }
    // Переопределить метод area() для прямоугольного треугольника
    double area() {
        System.out.println("Внутри area() для Triangle");
        return dim1 * dim2 / 2;
    }
}

class RedefineMethodsExample_9 {
    public static void main(String[] args) {
        Figure fig = new Figure(25, 25); // создали объект фигуры
        Rectangle rect = new Rectangle(100, 100); // создали объект прямоугольника
        Triangle triag = new Triangle(34, 34); // создали объект треугольника

        Figure figref; // создали ссылку для диспетчеризации методов

        figref = fig; // ссылаемся на объект фигуры
        figref.area(); // вызываем метод area() для фигуры

        figref = rect; // ссылаемся на объект прямоугольника
        figref.area(); // вызываем метод area() для прямоугольника

        figref = triag; // ссылаемся на объект треугольника
        figref.area(); // вызываем метод area() для треугольника
    }
}
/*
Площадь для Figure не определена.
Внутри area() для Rectangle.
Внутри area() для Triangle
*/