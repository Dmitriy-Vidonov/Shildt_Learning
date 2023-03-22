package ru.shildtlearning.chapter7_method_and_classes_analysis;

// Демонстрация различия между public и private
class TestDiff {
    int a; // стандартный доступ
    public int b; // открытый доступ
    private int N; // закрытый доступ

    // методы доступа к N
    void setN(int i){ // установить значение N - метод сеттер
        N = i;
    }

    int getN() { // получить значение N - метод геттер
        return N;
    }
}

class PublicPrivateDifference_10 {
    public static void main(String[] args) {
        TestDiff ob = new TestDiff();

        // Так поступать можно, т.к. к членам a и b разрешен прямой доступ
        ob.a = 10;
        ob.b = 20;

        // Так поступать нельзя, к полю N доступ закрыт и возникнет ошибка
        // ob.N = 20; // ОШИБКА

        // Получать доступ к полю N необходимо через его методы
        ob.setN(100); // так делать можно
        System.out.println("a, b и N: " + ob.a + " " + ob.b + " " + ob.getN());
    }
}
