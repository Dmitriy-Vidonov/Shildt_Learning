package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1;

class Derived extends Protection { // подкласс
    Derived() {
        System.out.println("Конструктор подкласса от класса Protection");
        System.out.println("n = " + n);
        // Только класс
        // System.out.println("n_pri = " + n_pro) // private член класса подклассу недоступен

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
