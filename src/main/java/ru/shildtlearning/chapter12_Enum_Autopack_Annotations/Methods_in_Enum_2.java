package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Демонстрация использования методов ordinal(), compareTo(), equals() в enum
// Перечисление собакенов
enum Doggos {
    Sharik, Sobarik, Doge, Pesus
}

public class Methods_in_Enum_2 {
    public static void main(String[] args) {
        Doggos sobak1, sobak2, sobak3;

        // Получить все порядковые номера с применением ordinal()
        System.out.println("Все константы перечисления Doggos с порядковыми номерами: ");
        for(Doggos dog : Doggos.values()) System.out.println(dog + " " + dog.ordinal());

        sobak1 = Doggos.Sharik;
        sobak2 = Doggos.Doge;
        sobak3 = Doggos.Sharik;
        System.out.println();

        // Демонстрация исползования compareTo() и equals()
        if(sobak1.compareTo(sobak2) < 0)
            System.out.println(sobak1 + " находится перед " + sobak2);

        if(sobak2.compareTo(sobak1) > 0)
            System.out.println(sobak2 + " находится после " + sobak1);

        if(sobak1.compareTo(sobak3) == 0)
            System.out.println(sobak1 + " равно " + sobak3);

        System.out.println();

        // Демонстрация работы метода equals() и ==
        if(sobak1.equals(sobak2))
            System.out.println("Ошибка!");

        if(sobak1.equals(sobak3))
            System.out.println(sobak1 + " равно " + sobak3);

        if(sobak1 == sobak3)
            System.out.println(sobak1 + " == " + sobak3);
    }
}
