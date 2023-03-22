package ru.shildtlearning.chapter10_Exceptions;

// В этой программе создается специальный тип исключения
class MyException extends Exception {
    private int detail;
    MyException(int a) { // прописываем свой конструктор, куда передаем нужную нам переменную нужного типа
        detail = a;
    }
    public String toString() { // переопределяем метод toString() для формирования вывода сообщения
        return "MyException[" + detail + "]";
    }
}

class MyException_Demo_12 {
    static void compute(int a) throws MyException { // во throws следует обязательно прописывать собственное исключение
        System.out.println("Вызов compute(" + a + ")");
        if(a > 10)
            throw new MyException(a); // генерируем исключение лишь в случае a > 10, иначе завершение нормальное
        System.out.println("Нормальное завершение");
    }

    public static void main(String[] args) {
        try{ // мы пользуемся методами, которые генерируют исключение, поэтому вызов идет внутри try-catch
            compute(1);
            compute(20);
        } catch (MyException err) {
            System.out.println("Перехвачено исключение: " + err);
        }
    }
}
