package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Автоупаковка/автораспаковка объектов boolean и character
class Autopack_boolean_character_7 {
    public static void main(String[] args) {
        // Автоматически упаковать / распаковать значение boolean
        Boolean b = true;

        // Ниже b автоматически распаковывается при использовании
        if(b) System.out.println("b равно true");

        // Автоматическая работа с char
        Character ch = 'x'; // упаковать char
        char ch2 = ch; // распаковать char
        System.out.println("ch2 равно " + ch2);
    }
}
