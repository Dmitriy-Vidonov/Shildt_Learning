package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.static_interface_methods;

public interface MyIF {
    // Это объявление "обычного" метода интерфейса. БЕЗ стандартной реализации
    int getNumber();

    // Это метод с реализацией "по умолчанию"
    default String getString() {
        return "Стандартная строка";
    }

    // Это статический метод интерфейса - НЕ НАСЛЕДУЕТСЯ НИ РЕАЛИЗУЮЩИМ КЛАССОМ НИ ПРОИЗВОДНЫМИ ИНТЕРФЕЙСАМИ
    static int getDefaultNumber() { // метод можно вызвать например int defNum = MyIF.getDefaultNumber();
        return 0;
    }
}