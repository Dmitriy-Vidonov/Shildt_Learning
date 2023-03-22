package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// КАК ДЕЛАТЬ НЕ СТОИТ
// Неудачное применение автоупаковки / автораспаковки
class WRONG_use_of_autopack_8 {
    public static void main(String[] args) {
        Double a, b, c; // Double - это обертка типа. Здесь она излишня и ведет к лишним расчетам. надо юзать double
        a = 10.0;
        b = 4.0;

        c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна = " + c);
    }
}
