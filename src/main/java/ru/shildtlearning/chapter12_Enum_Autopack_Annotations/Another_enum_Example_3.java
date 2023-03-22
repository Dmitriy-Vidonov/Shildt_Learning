package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;
import java.util.Random;

// Версия "системы принятия решений" (из главы 9) через enum

// Перечисление возможных ответов
enum Answers{
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble()); // сгенерили число от 0.0 до 1.0 и умножили на 100
        if(prob < 15)
            return Answers.MAYBE; // 15%
        else if(prob < 30)
            return Answers.NO; // 15%
        else if(prob < 60)
            return Answers.YES; // 30%
        else if(prob < 75)
            return Answers.LATER; // 15%
        else if(prob < 98)
            return Answers.SOON; // 13%
        else
            return Answers.NEVER;
    }
}
public class Another_enum_Example_3 {
    static void answer(Answers result) {
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
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
