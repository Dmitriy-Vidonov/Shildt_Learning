package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.stack_with_interfaces;

// Тестируем реализацию стека с классом FixedStack - то есть с реализацией через стек фиксированной длины
class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(10);
        FixedStack mystack2 = new FixedStack(15);

        // Поместить несколько чисел в стеки
        for(int i=0; i<10; i++) mystack1.push(i);
        for (int i=0; i<15; i++) mystack2.push(i);

        // Извлечь эти числа из стеков
        System.out.println("Стек в mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2:");
        for(int i=0; i<15; i++)
            System.out.println(mystack2.pop());
    }
}
