package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.stack_with_interfaces;

// Класс FixedStack - реализует хранилище фиксированной длины
class FixedStack implements IntStack {
    private int[] stck;
    private int tos;

    // Разместить в памяти и инициализировать стек:
    FixedStack(int size) { // конструктор класса
        stck = new int[size]; // размерность стека
        tos = -1; // вершина стека
    }

    // Поместить элемент в стек - реализация метода из интерфейса
    public void push(int item) {
        if(tos == stck.length-1)
            System.out.println("Стек полон");
        stck[++tos] = item;
    }

    // Извлечь элемент из стека - реализация метода из интерфейса
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        }
        return stck[tos--];
    }
}
