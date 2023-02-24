package ru.shildtlearning.chapter7;


// Объекты передаются через ссылки на них
class TestObj {
    int a, b;

    TestObj(int i, int j){
        a = i;
        b = j;
    }

    // Передать объект
    void meth(TestObj ob){
        ob.a *= 2;
        ob.b /= 2;
    }
}

class ObjectsArgsTransition_7 {
    public static void main(String[] args) {
        TestObj obj1 = new TestObj(15, 20);

        System.out.println("obj1.a и obj1.b перед вызовом: " + obj1.a + " " + obj1.b);

        obj1.meth(obj1);

        System.out.println("obj1.a и obj1.b после вызова: " + obj1.a + " " + obj1.b);
    }
}
