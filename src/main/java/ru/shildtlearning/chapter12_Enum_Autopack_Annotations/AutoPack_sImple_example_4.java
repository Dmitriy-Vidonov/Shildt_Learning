package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Простой пример упаковки-распаковки
class AutoPack_sImple_example_4 {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100); // УПАКОВКА значения 100 в объект Integer
        int i = iOb.intValue(); // распаковка - вытащили значение из объекта Integer и присвоили примитиву
        System.out.println(i + " " + iOb); // выводит 100 100

        // АВТОУПАКОВКА И АВТОРАСПАКОВКА
        Integer iOb2 = 200; // автоупаковка значения int
        int k = iOb2; // автораспаковка в примитив
        System.out.println(k + " " + iOb2); // выводит 200 200
    }
}
