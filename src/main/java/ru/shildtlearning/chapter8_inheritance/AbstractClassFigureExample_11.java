package ru.shildtlearning.chapter8_inheritance;

// Еще один пример использования абстрактных методов и классов
abstract class Figure_abs {
    double dim1;
    double dim2;
    Figure_abs (double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area(); // объявление абстрактного метода
}

class Rectangle_abs extends Figure_abs {
    Rectangle_abs (double a, double b) {
        super(a, b);
    }
    // переопределить area() для прямоугольника
    double area() {
        System.out.println("Внутри area() для Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle_abs extends Figure_abs {
    Triangle_abs (double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Внутри area() для Triangle.");
        return dim1 * dim2 / 2;
    }
}

class AbstractClassFigureExample_11 {
    public static void main(String[] args) {
        // Figure_abs fig = new Figure_abs(10, 15); // теперь недоступно, т.к. это абстрактный класс. причем есть конструктор!
        Rectangle_abs rect = new Rectangle_abs(10,15);
        Triangle_abs triag = new Triangle_abs(56, 53);

        Figure_abs fig_link; // нормальная запись, так как создается лишь ссылка, самого объекта не создается

        fig_link = rect;
        System.out.println("Площадь равна " + fig_link.area());

        fig_link = triag;
        System.out.println("Площадь равна " +fig_link.area());
    }
}
