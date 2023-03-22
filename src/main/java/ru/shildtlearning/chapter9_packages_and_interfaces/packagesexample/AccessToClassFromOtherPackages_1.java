package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample;

// Класс AccessToClassFromOtherPackages_1, его конструктор и метод show() - открытые
// Это значит, что их можно использовать и за пределами пакета и в классах не являющимися подклассами от нашего класса
public class AccessToClassFromOtherPackages_1 {
    String name;
    double bal;

    public AccessToClassFromOtherPackages_1(String n, double b) {
        name = n;
        bal = b;
    }

    public void show(){
        if(bal<0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}
// Протестируем доступность вышеописанного класса в пакете chapter9_test_package

