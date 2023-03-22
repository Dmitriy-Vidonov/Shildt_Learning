package ru.shildtlearning.chapter8_inheritance;

// Если мы работаем с наследованием, выведенным типом является объявленный тип инициализатора
// и он может отличаться от производного типа объекта, на который инициализатор ссылается
class A_vars {
    String msgA_vars = "Сообщение для А_vars";
    String toString(A_vars obj) {
        return "это переопределенный метод для А_vars = " + msgA_vars;
    }
}

class B_vars extends A_vars {
    int x;
    // ...
}

class C_vars extends B_vars {
    int y;
    // ...
}

class LocalVarsAndInheritance_13 {
    // Вернуть некоторый тип объекта MyClass
    static A_vars getObj(int which) {
        switch (which) {
            case 0: return new A_vars();
            case 1: return new B_vars();
            default: return new C_vars();
        }
    }
    public static void main(String[] args) {
        // Несмотря на то, что getObj() возвращает разные типы объектов в иерархии наследования от A
        // объявленным типом возвращаемого значения является A
        // мы вроде как получаем разные типы объектов, но предполагается, что типом переменных является A

        // Здесь getObj() вернет объект A
        var mc = getObj(0);

        // Здесь getObj() вернет объект B
        var mc2 = getObj(1);

        // Здесь getObj() вернет объект C
        var mc3 = getObj(2);

        // при этом ни mc2 ни mc3 не могут получить доступ к полям x и y, т.к. являются объектами класса A

        Object ref_link = mc2;
        System.out.println("equals - " + mc.equals(mc2));
        System.out.println("класс mc = " + mc.getClass());
        System.out.println("хэш объекта mc = " + mc.hashCode());
        System.out.println("строка, которая описывает объект mc = " + mc.toString());
    }
}
