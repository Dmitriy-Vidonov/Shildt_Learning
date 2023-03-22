package ru.shildtlearning.chapter10_Exceptions;

class Try_Catch_Example_2 {
    public static void main(String[] args) {
        int a, d;
        try{ // Отслеживаемый блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это выводиться не будет");
        } catch (ArithmeticException err) { // перехватить ошибку деления на ноль
            System.out.println("Тут прозошло деление на ноль!");
        }
        System.out.println("Некий код после оператора catch");
    }
}
