package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample;

// данный класс должен быть абстрактным, так как не полностью реализует интерфейс Callback, состоящий из 2-х методов
abstract class IncompleteInterfaceRealisation implements Callback {
    public void callback(int param){
        System.out.println("Реализация интерфейса Callback абстрактным классом");
    }
}
