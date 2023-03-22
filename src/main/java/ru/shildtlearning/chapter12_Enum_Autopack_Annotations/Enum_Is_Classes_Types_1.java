package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Использование конструктора перечисления, переменной экземпляра и метода
// 1 - перечисление не может быть унаследовано от другого класса
// 2 - перечисление не может быть суперклассом.
// В остальным перечисления действуют как классы
enum Dawgs {
    // Т.е. по сути мы в самом перечислении используем конструктор, который описан ниже. Каждый собакен с очками удачи.
    Tuzik(10), Sharik(20), Pesus(7), Kabysdoh(15), Valera(8), Shamotra(); // каждая константа - объект класса Dawgs
    private int luck; // удача каждого песуса

    // Конструктор перечисления - стандартный
    Dawgs(int L) {
        luck = L;
    }
    // Перегруженный конструктор
    Dawgs() {
        luck = 0;
    }

    // Метод перечисления
    int getLuck() {
        return luck;
    }
}

class Enum_Is_Classes_Types_1 {
    public static void main(String[] args) {
        Dawgs doggo;
        // Отобразить параметр удачи пёселя
        System.out.println("Удача Песуса составляет " + Dawgs.Pesus.getLuck() + " очков");

        // Отобразить всех песусов с их удачей
        for(Dawgs dog : Dawgs.values())
            System.out.println("Пёсель по имени " + dog + " с показателем удачи в " + dog.getLuck() + " очков!");

        // Сравнить порядок констант относительно друг друга. если < 0, то аргумент после вызывающей. 0 - обе равны
        // > 0 если аргумент перед вызывающей
        System.out.println(Dawgs.Tuzik + " по отношению к " + Dawgs.Pesus + " | compareTo() | "
                + Dawgs.Tuzik.compareTo(Dawgs.Pesus)); // -2, т.е. Pesus после Tuzik через 2 позиции
        System.out.println(Dawgs.Shamotra + " по отношению к " + Dawgs.Valera + " | compareTo() | "
                + Dawgs.Shamotra.compareTo(Dawgs.Valera)); // 1, т.е. Valera перед Shamotra на 1 позицию
        System.out.println(Dawgs.Sharik + " по отношению к " + Dawgs.Sharik + " | compareTo() | "
                + Dawgs.Sharik.compareTo(Dawgs.Sharik)); // 0, т.е. позиции равны
    }
}
