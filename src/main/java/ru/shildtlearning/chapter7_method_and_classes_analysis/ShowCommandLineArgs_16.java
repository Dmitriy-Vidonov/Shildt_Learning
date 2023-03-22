package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Отображение всех аргументов командной строки
class ShowCommandLineArgs_16 {
    public static void main(String[] args) {
        for(int i=0; i< args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
