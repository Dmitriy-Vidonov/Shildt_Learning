package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.constantsInInterfaces;
import java.util.Random;

// Задаем интерфейс с константами
interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;
}

// Класс, реализующий интерфейс. Используются константы, описанные в интерфейсе
class Question implements SharedConstants {
    Random rand = new Random(); // создаем объект класса Random, подключаемый извне
    int ask() {
        int prob = (int) (100 * rand.nextDouble()); // nextDouble - метод класса Random, возвращает double между 0.0 - 1.0
        if (prob < 30)
            return NO; // 30%
        else if (prob < 45)
            return MAYBE; // ??
        else if (prob < 60)
            return YES; // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON; // 13%
        else
            return NEVER; // 2%
    }
}

// Класс, реализующий интерфейс. В данном случае мы просто забираем из интерфейса константы
class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Скоро");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question(); // Создаем объект класса Question, который производит расчет

        answer(q.ask()); // метод ask() из объекта класса Question передает значение, а answer его интерпретирует
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
