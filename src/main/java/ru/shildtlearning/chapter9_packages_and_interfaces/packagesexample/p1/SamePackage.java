package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1;

class SamePackage { // просто отдельный класс в том же пакете что и Protection, но не производный от него
    SamePackage() {
        Protection p = new Protection();
        System.out.println("Конструктор обычного класса из того же пакета что и Protection");
        System.out.println("n = " + p.n); // пытаемся получить доступ к члену экземпляра класса Protection

        // Доступ к private члену только из класса Protection
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
