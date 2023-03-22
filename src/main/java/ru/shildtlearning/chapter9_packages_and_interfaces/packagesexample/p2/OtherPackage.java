package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p2;

import ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1.Protection;

class OtherPackage {
    OtherPackage() {
        ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1.Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");

        // Доступ к обычному члену экземпляра класса из другого пакета без модификаторов - недоступен
        // System.out.println("n = " = p.n);

        // Доступ к private члену экземпляра класса из другого пакета - недоступен
        // System.out.println("n_pri = " + p.n_pri);

        // Доступ к protected члену экземпляра класса из другого пакета - недоступен
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub); // из экземпляра класса из другого пакета доступен только public член
    }
}
