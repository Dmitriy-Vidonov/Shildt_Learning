package ru.shildtlearning.chapter10_Exceptions;

// Пример использования сразу нескольких catch вместе
class Multiple_Catch_4 {
    public static void main(String[] args) {
        try {
             int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a; // здесь будет деление на 0
            int[] c = {1};
            c[42] = 99; // здесь будет выход за пределы массива
        } catch(ArithmeticException arithm_err) {
            System.out.println("Деление на ноль: " + arithm_err);
        } catch (ArrayIndexOutOfBoundsException arr_err) {
            // если перехватим деление на 0, то этого блока уже не увидим
            System.out.println("Выход за допустимые пределы индекса в массиве: " + arr_err);
        }
        System.out.println("Исполнение кода после блоков try-catch");
    }
}
