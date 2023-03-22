package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

public class Simple_Enum_Examples_0 {
    public static void main(String[] args) {
        enum Dawgs { // перечисление Dawgs определяется как тип класса. У перечислений могут быть конструкторы, методы
            // и переменные экземпляра
            SHARIK, // константа перечисления. неявно определена как public static final член класса. т.е. тип Dawgs
            TUZIK, // это "самотипизированные константы", т.к. все принадлежат типу Dawgs
            PESUS
        }

        Dawgs Pesel; // создаем переменную типа "перечисление"
        Pesel = Dawgs.TUZIK; // либо можно так создать переменную.

        Dawgs favDog = Dawgs.PESUS; // переменная favDog типа Dawgs - то есть enum. Можно выбрать только из 3-х
        String name = Dawgs.PESUS.toString();

        if(Pesel != favDog) System.out.println("Pesel не есть favDog!"); // сравнение констант

        System.out.println("имя = " + name); // имя = PESUS
        System.out.println("порядковый номер = " + Dawgs.PESUS.ordinal()); // порядковый номер в списке enum = 2

        // Получить список значений из перечисления
        System.out.println("Получить весь список песусов через values()");
        Dawgs[] allDogs = Dawgs.values(); // создали массив allDogs типа Dawgs
        for (Dawgs doggo_from_allDogs : allDogs) System.out.println(doggo_from_allDogs);

        // Получение значения переменной перечисления по строке
        System.out.println("Использование valueOf()");
        String doggoName = "TUZIK";
        System.out.println(Dawgs.valueOf(doggoName)); // valueOf()


        favDog = Dawgs.SHARIK; // присвоили новое значение в favDog
        // Упраление перечислением через switch
        switch (favDog) {
            case PESUS:
                System.out.println("Это Песус - классический собакен");
                break;
            case SHARIK:
                System.out.println("Это Шарик - так часто зовут собак в повестях");
                break;
            case TUZIK:
                System.out.println("А это Тузик - так любят называть собак в деревнях");
                break;
        }
    }
}
