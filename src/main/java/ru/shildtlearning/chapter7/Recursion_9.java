package ru.shildtlearning.chapter7;

// Простейший пример использования рекурсии
class Factorial {
    // Рекурсивный метод
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

class Recursion_9 {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Факториал 3 = " + f.fact(3));
        System.out.println("Факториал 5 = " + f.fact(5));
        System.out.println("Факториал 10 = " + f.fact(10));
    }
}
