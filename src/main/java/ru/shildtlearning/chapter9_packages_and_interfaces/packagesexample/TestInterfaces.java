package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample;

public class TestInterfaces implements Callback, Pushback { // подключено 2 интерфейса, надо реализовать все их методы
    public void push(int num) { // методы, реализующие интерфейс, должны быть public. та же сигнатура типов!
        System.out.println("Метод push из интерфейса Pushback + " + num);
    }
    public void callback(int param) { // методы, реализующие интерфейс, должны быть public. та же сигнатура типов!
        System.out.println("Метод callback из интерфейса Callback + " + param);
    }

    public void doublecall(String msg) { // реализация второго метода из интерфейса Callback
        System.out.println("Второй метод из интерфейса Callback + " + msg);
    }

    void NonInterfaceMethod() { // классы, реализующие интерфейсы - спокойно могут иметь свои собственные методы
        System.out.println("Собственный метод класса, не затрагивающий интерфейсы");
    }

    public static void main(String[] args) {
        Callback c_call = new TestInterfaces(); // c_call - объявлена с типом интерфейса Callback, но присвоили ей
        // экземпляр класса TestInterfaces, в котором прописана реализация метода интерфейса Callback
        c_call.callback(47); // переменной интерфейса доступны ТОЛЬКО методы из описания интерфейса
        c_call.doublecall("test msg"); // вот второй метод, который можно увидеть из переменной интерфейса

        Pushback p_push = new TestInterfaces();
        p_push.push(56);
    }
}
