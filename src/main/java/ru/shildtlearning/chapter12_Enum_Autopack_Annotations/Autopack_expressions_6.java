package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Автоупаковка и автораспаковка происходит внутри выражений
class Autopack_expressions_6 {
    public static void main(String[] args) {
        Integer iOb1, iOb2;
        int i;
        iOb1 = 100;
        System.out.println("Исходное значение iOb1: " + iOb1);

        // В след. операторе iOb1 автоматически распакуется, выполнит ++ и запакуется назад
        ++iOb1;
        System.out.println("После ++iOb1: " + iOb1);

        // Здесь iOb1 распаковывается, выражение вычисляется и рез-тат заново пакуется и присваивается iOb2
        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2 после вычисления выражения: " + iOb2);

        // Вычисляется то же самое выражение, рез-тат не пакуется заново
        i = iOb1 + (iOb1 / 3);
        System.out.println("i после вычисления выражения: " + i);


        // Автораспаковка может смешивать в выражении разные типы числовых объектов
        // Как распаковали - применяются стандартные повышения и преобразования
        Integer iOb = 100;
        Double dOb = 98.6;

        dOb = dOb + iOb;
        System.out.println("dOb после вычисления выражения: " + dOb); // 198.6

        // Объекты Integer можно использовать в switch благодаря автораспаковке
        Integer sw = 2;
        switch (sw) {
            case 1:
                System.out.println("один");
                break;
            case 2:
                System.out.println("два");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}
