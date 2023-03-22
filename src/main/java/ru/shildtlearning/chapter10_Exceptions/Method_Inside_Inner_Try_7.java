package ru.shildtlearning.chapter10_Exceptions;

// Пример того, как операторы try могут быть неявно вложенными через вызовы методов
class Method_Inside_Inner_Try_7 {
    static void nestedTry(int a) {
        try { // вложенный блок try внутри метода
            // если a = 1, то следующий код сгенерирует деление на ноль
            if(a == 1) a = a / (a - a);

            // если а = 2, то следующий код сгенерирует исключение выхода за пределы массива
            if(a == 2){
                int[]c = { 1 };
                c[42] = 99; // генерация исключения ArrayIndexOutOfBoundsException
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("Выход за допустимые пределы индекса в массиве: " + err);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            // если аргументов нет, то ниже будет сгенерировано исключение деления на ноль
            int b = 42 / a;
            System.out.println("a = " + a);
            nestedTry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
