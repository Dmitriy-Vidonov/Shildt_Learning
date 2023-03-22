package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.stack_with_interfaces;

// Здесь мы реализуем расширяемый стек
class DynamicStack implements IntStack{
    private int[] stck;
    private int tos;

    // Конструктор - разместить в памяти и инициализировать стек
    DynamicStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек - реализуем метод интерфейса
    public void push(int item) {
        // Если стек полон, тогда создать стек больше размера
        if(tos == stck.length-1) {
            int[] temp = new int[stck.length * 2]; // создаем новый стек удвоенного размера
            for(int i=0; i<stck.length; i++) temp[i] = stck[i]; // заносим в него весь предыдущий стек
            stck = temp; // переводим ссылку на стек с начального размера на удвоенный
            stck[++tos] = item;
        }
        stck[++tos] = item;
    }

    // Извлечь элемент из стека - реализуем метод интерфейса
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек опустошен");
            return 0;
        }
        return stck[tos--];
    }
}

// Тестируем взаимодействие динамического стека и интерфейса
class IFTest2 {
    public static void main(String[] args) {
        DynamicStack mydinstack1 = new DynamicStack(7);
        DynamicStack mydinstack2 = new DynamicStack(9);

        // Эти циклы в итоге увеличивают каждый стек
        for(int i=0; i<12; i++) mydinstack1.push(i);
        for(int i=0; i<20; i++) mydinstack2.push(i);

        System.out.println("Стек в mydinstack1:");
        for(int i=0; i<12; i++)
            System.out.println(mydinstack1.pop());

        System.out.println("Стек в mydinstack2:");
        for(int i=0; i<20; i++)
            System.out.println(mydinstack2.pop());

    }
}
