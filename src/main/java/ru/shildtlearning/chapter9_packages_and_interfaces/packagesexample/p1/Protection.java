package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1;

public class Protection { // Наш базовый класс, к переменным экземпляра которого мы постараемся получить доступ
    int n = 1 ;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("Конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
