package ru.shildtlearning.chapter10_Exceptions;

class MyOwnException extends Exception {
    // Пустой класс, даже вообще ничего не пишем
    MyOwnException(){}
    MyOwnException(String msg){
    }
}
class MyOwn_Exception_Classes_11 {
    static boolean test() throws MyOwnException {
        try {
            throw new MyOwnException("Сообщение"); // но так как мы наследуемся от Throwable - у err - методы доступны
        }catch (MyOwnException err) {
            System.out.println("Перехвачено - " + err.getMessage());
        }
        return false;
    }
    public static void main(String[] args) throws MyOwnException {
        System.out.println(test());
    }
}
