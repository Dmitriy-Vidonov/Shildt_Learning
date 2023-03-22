package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample;

public class TestInterfaceDispetchering {
    public static void main(String[] args) {
        Callback c_call = new TestInterfaces(); // TestInterfaces - класс, реализующий интерфейс
        // c_call - переменная типа интерфейса Callback
        AnotherTestInterface anothertest_ob = new AnotherTestInterface(); // объект 2-ого класса, реализующего интерфейс
        c_call.callback(50); // вызовется реализация метода callback из класса TestInterfaces
        c_call = anothertest_ob; // сделали ссылку на объект класса AnotherTestInterface
        c_call.callback(50); // вызовется реализация метода callback из класса AnotherTestInterface
        // т.е. мы должны создать ссылочную переменную типа "интерфейс", далее - создать объекты классов,
        // реализующих интерфейсы и потом в зависимости от того, на какой объект направляем ссылчную переменную
        // интерфейса - тот объект того класса и будет реализовывать метод из интерфейса

        // Еще пример
        // Создаем объект интерфейса и по объекту каждого класса, реализующего интерфейс
        Pushback p_push; // ссылочная переменная интерфейса Pushback
        TestInterfaces testInter_obj = new TestInterfaces(); // новый объект класса TestInterfaces
        AnotherTestInterface anotherTestInter_obj = new AnotherTestInterface(); // новый объект класса AnotherTestInterface

        p_push = testInter_obj; // направили ссылку типа "интерфейс" на объект класса TestInterfaces
        p_push.push(75); // получили реализацию метода push() из класса TestInterfaces

        p_push = anotherTestInter_obj; // направили ссылку типа "интерфейс" на объект класса AnotherTestInterface
        p_push.push(75); // получили реализацию метода push() из класса AnotherTestInterface
    }
}
