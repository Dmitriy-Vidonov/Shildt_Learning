package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.multiple_inheritance_problem;

class MyClass implements Alpha, Beta {
    public void getSum() {
        System.out.println("Реализация метода getSum()");
    }

    public void reset() {
        System.out.println("Собственная реализация метода reset()");
    }
}
