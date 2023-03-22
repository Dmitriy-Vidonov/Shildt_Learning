package ru.shildtlearning.chapter12_Enum_Autopack_Annotations;
import java.lang.reflect.*;

class Work_with_Class_Methods {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<?> stringClass = String.class;

        // Получение списка публичных методов класса String
        Method[] methods = stringClass.getMethods();
        for(Method method : methods) System.out.println(method.getName()); // выдаст в столбик все методы String

        // Создание нового объекта типа String с помощью рефлексии
        Constructor<?> constructor = stringClass.getConstructor(String.class);
        String str = (String)constructor.newInstance("Hello");
        System.out.println(str); // Hello
    }
}
