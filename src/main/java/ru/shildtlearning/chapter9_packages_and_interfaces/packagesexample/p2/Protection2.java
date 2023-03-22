package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p2;

class Protection2 extends ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.p1.Protection { // подклас от класса Protection в пакете p1
    Protection2() {
        System.out.println("Конструктор производного класса из другого пакета");

        // Доступ к члену суперкласса без модификатора недоступен
        // System.out.println("n = " + n);

        // Доступ к private члену суперкласса недоступен подклассу
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
