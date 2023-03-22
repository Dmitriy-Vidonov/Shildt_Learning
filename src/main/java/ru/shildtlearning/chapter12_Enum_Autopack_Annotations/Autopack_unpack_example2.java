package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;

// Автоупаковка и автораспаковка выполняется в отношении параметров и возвращаемого метода
class Autopack_unpack_example2 {
    // Принимает параметр Integer и возвращает значение int
    static int m(Integer v) {
        return v; // автораспаковка в int
    }

    public static void main(String[] args) {
        // Передать значение int в m() и присвоить возвращаемое значение объекту Integer
        // аргумент 100 автопакуется в объект Integer. Возвращаемое тоже автоупакуется в Integer
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}
