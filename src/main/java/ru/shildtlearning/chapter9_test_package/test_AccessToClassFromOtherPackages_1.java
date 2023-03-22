package ru.shildtlearning.chapter9_test_package;
import ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.*;

public class test_AccessToClassFromOtherPackages_1 {
    public static void main(String[] args) {
        // т.к. AccessToClassFromOtherPackages_1 открыт, мы можем использовать этот класс и вызывать конструктор
        var test = new AccessToClassFromOtherPackages_1("J. J. Testing", 100);

        test.show(); // можем вызывать и метод класса
    }
}
