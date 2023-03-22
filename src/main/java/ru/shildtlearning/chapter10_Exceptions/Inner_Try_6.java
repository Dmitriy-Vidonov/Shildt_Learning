package ru.shildtlearning.chapter10_Exceptions;

// Пример применения вложенных операторов try
class Inner_Try_6 {
    public static void main(String[] args) {
        try {
            int a = args.length; // ноль при запуске программы без аргументов
            int b = 42 / a; // здесь будет деление на ноль при запуске кода без аргументов
            System.out.println("a = " + a);

            try { // вложенный блок try
                if (a == 1)
                    a = a / (a - a); // если а = 1, сгенерим деление на ноль

                if (a == 2) {
                    int[] c = { 1 };
                    c[42] = 99; // сгенерит исключение ArrayIndexOutOfBoundException
                }
            } catch (ArrayIndexOutOfBoundsException err) {
                System.out.println("Выход за допустивые пределы индекса в массиве: " + err);
            }
        }catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e);
        }
    }
}
