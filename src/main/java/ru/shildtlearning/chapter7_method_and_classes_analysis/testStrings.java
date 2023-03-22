package ru.shildtlearning.chapter7_method_and_classes_analysis;

public class testStrings {
    public static void main(String[] args) {
        String[] strArr = {"один", "два", "три"};
        for(String word : strArr) System.out.print(word + " ");
        System.out.println();

        String str1 = "строкуленция";
        String str2 = "строкуленция";
        String str3 = "просто строка";

        System.out.println("str1 и str2 = " + str1.equals(str2)); // true
        System.out.println("str2 и str3 = " + str2.equals(str3)); // false

        System.out.println("длина str1 = " + str1.length());

        System.out.println("Символ str1 по индексу 2 = " + str1.charAt(2));
    }
}
