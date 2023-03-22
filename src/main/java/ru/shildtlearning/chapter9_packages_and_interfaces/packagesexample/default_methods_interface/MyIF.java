package ru.shildtlearning.chapter9_packages_and_interfaces.packagesexample.default_methods_interface;

public interface MyIF {
    // Обычное определение метода в интерфейсе - без реализации
    int getNumber();

    // А это метод "по умолчанию", "стандартный". Через ключевое слово default. Дает реализацию по умолчанию
    default String getString() {
        return "Стандартная строка";
    }
}

// Реализовать MyIF
class MyIFImp implements MyIF {
    // Текущему классу в обязательном порядке нужно реализовать только метод getNumber()
    // метод getString() реализовывать НЕ ОБЯЗАТЕЛЬНО, т.к. стандартная реализация уже прописана в интерфейсе
    public int getNumber() {
        System.out.print("Реализация метода интерфейса getNumber(): ");
        return 100;
    }
}

// Реализуеи MyIF и переопределим метод по умолчанию
class MyIFImp2 implements MyIF {
    public int getNumber() {
        System.out.print("Реализация метода getString(): ");
        return 100;
    }

    // Переопределение стандартного метода интерфейса
    public String getString() {
        return "Строка из переопределенного стандартного метода";
    }
}

// Тестовый пример - создаем экземпляр класса MyIFImp для вызова методов getNumber() и getString()
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Метод getNumber() можно вызвать, потому что его мы реализовали в классе MyIFImp
        System.out.println(obj.getNumber());

        // Здесь будет использован стандартный метод
        System.out.println(obj.getString());

        MyIFImp2 obj2 = new MyIFImp2();
        System.out.println(obj2.getString()); // здесь вызовется переопределенный метод
    }
}