package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Аргументы переменной длины и перегрузка
class VarArgsMethOverload_18 {
    static void vaTest(int ... v) {
        System.out.println("vaTest(int...): " + "Количество аргументов: " + v.length + " Содержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v)  {
        System.out.println("vaTest(boolean...): " + "Количество аргументов: " + v.length + " Содержимое: ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String str, int ... v)  {
        System.out.println("vaTest(String, int...): " + str + v.length + " Содержимое: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(){
        System.out.println("Метод без аргументов");
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тестирование: " + 104, 4, 54);
        vaTest(false, true, false);
        vaTest();
    }
}
