package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.private_methods_inside_interfaces;

// Пример закрытого private метода интерфейса, который используют 2 метода по умолчанию
interface IntStack {
    void push(int item); // сохранить элемент
    int pop(); // извлечь элемент

    // Метод по умолчанию, возвращающий массив, содержащий верхние n элементов в стеке
    default int[] popNElements(int n) {
        // Возвратить запрошенные элементы
        return getElements(n);
    }

    // Метод по умолчанию, возвращающий массив, который содержит следующие n элементов в стеке после пропуска
    // skip элементов
    default int[] skipAndPopNElements(int skip, int n) {
        // Пропустить указанное количество элементов
        getElements(skip);

        // Возвратить запрошенные элементы
        return getElements(n);
    }

    // Закрытый метод, который возвращает массив, содержащий верхние n элементов в стеке
    private int[] getElements(int n) {
        int[] elements = new int[n];

        for(int i=0; i<n; i++) elements[i] = pop();
        return elements;
    }
}
