package ru.shildtlearning.chapter10_Exceptions;
import java.util.Random;

class Try_Catch__Example_3 {
    public static void main(String[] args) {
        int a = 0, b=0, c=0;
        Random rand = new Random();

        for(int i=0; i<32000; i++) {
            try {
                b = rand.nextInt();
                c = rand.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException err) {
                System.out.println("Произошло деление на ноль: " + err);
                a = 0; // установить a в 0 и продолжить
            }
            System.out.println("a = " + a);
        }
    }
}
