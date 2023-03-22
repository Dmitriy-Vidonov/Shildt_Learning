package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Класс реализует стек целых чисел, который может хранить 10 значений
class Stack {
    // stck и tos - закрыты. Что не даст случайно или с умыслом их изменить и повредить стек
    private int[] stck;
    private int tos;
    // Разместить и инициализировать стек
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в стек
    void push(int item) {
        if(tos == stck.length - 1)
            System.out.println("Стек полон");
        stck[++tos] = item;
    }

    // Извлечь элемент из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек пустой");
            return 0;
        }
        return stck[tos--];
    }
}

class StackWithRIghtAccess_11 {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack myStack2 = new Stack(8);

        // Поместить несколько чисел в стеки
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) myStack2.push(i);

        // Извлечь эти числа из стеков
        System.out.println("Стек 1:");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());
        System.out.println("Стек 2:");
        for(int i=0; i<8; i++)
            System.out.println(myStack2.pop());

        // Приведенные ниже операторы недопустимы
        // mystack1.tos = -2;
        // mystack.stck[3] = 100;
    }
}
