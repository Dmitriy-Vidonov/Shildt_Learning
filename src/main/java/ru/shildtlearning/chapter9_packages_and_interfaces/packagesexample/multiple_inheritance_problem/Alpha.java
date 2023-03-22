package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.multiple_inheritance_problem;

interface Alpha {
    void getSum();
    default void reset() {
        System.out.println("Реализация reset() в интерфейсе Alpha");
    }
}
