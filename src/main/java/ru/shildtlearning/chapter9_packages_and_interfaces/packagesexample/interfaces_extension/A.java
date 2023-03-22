package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.interfaces_extension;

// Один интерфейс может расширять другой
interface A { // исходный интерфейс
    void meth1();
    void meth2();
}

// Интерфейс B теперь включает meth1() и meth2() - и в свою очередь добавляет meth3()
interface B extends A {
    void meth3();
}

// А этот класс, так как реализует интерфейс B, должен заодно реализовать и интерфейс А, т.к. B унаследован от A
class MyClass implements B {
    public void meth1() {
        System.out.println("Реализация meth1()");
    }
    public void meth2() {
        System.out.println("Реализация meth2()");
    }
    public void meth3() {
        System.out.println("Реализация meth3()");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
