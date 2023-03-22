package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Пример выведения типов локальных переменных с пользовательским классом
class MyClass {
    private int N;
    MyClass(int k) {
        N = k;
    }
    int getN() {
        return N;
    }
    void setN (int k)
    {
        if(k >= 0) N = k;
    }
}

class UsingVarExample_19 {
    public static void main(String[] args) {
        var mc = new MyClass(10); // смотрите, как используем var
        System.out.println("Значение N в mc = " + mc.getN());
        mc.setN(100);
        System.out.println("А теперь N = " + mc.getN());
    }
}
