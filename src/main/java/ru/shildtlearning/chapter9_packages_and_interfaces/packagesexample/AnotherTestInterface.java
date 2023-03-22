package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample;

// Вторая реализация методов интерфейсов
class AnotherTestInterface implements Callback, Pushback {
    public void callback(int param){
        System.out.println("2-я реализация callback-а: " + (param * param));
    }
    public void doublecall(String msg){
        System.out.println("2-я реализация doublecall-a: " + msg);
    }
    public void push(int num){
        System.out.println("2-я реализация push-a: " + (num % 2));
    }
}
