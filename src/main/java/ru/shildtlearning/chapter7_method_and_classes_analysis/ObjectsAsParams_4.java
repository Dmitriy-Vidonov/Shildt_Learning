package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Объекты можно передавать методам
class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    // Вернуть true, если объект N равен вызывающему объекту
    boolean equalsTo(Test N){ // Этот метод будет вызываться от экземпляра класса.
        // Мы будем сравнивать параметры вызывающего экземпляра с экземпляром, который будет указан в параметре
        if(N.a == a && N.b == b) return true;
        else return false;
    }
}

class ObjectsAsParams_4 {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalsTo(ob2)); // true
        System.out.println("ob1 == ob3: " + ob1.equalsTo(ob3)); // false
    }
}
