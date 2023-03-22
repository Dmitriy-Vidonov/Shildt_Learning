package ru.shildtlearning.chapter10_Exceptions;

class non_caught_exception_1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        non_caught_exception_1.subroutine();
    }
}
