package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.stack_with_interfaces;

// Определяем интерфейс для целочисленного стека
interface IntStack {
    void push(int item); // сохранить элемент
    int pop(); // извлечь элемент

    // Добавляем стандартную реализацию метода очистки стека - clear(), что обновит функционал интерфейса
    // и не заставит в обязательном порядке реализовывать данный метод во всех классах, реализующих данный интерфейс
    default void clear() {
        System.out.println("Метод clear() не реализован");
    }
}
