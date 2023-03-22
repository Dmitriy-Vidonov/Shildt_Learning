package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1;

// Тестирование пакета p1
// Создать экземпляры различных классов в p1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
