package ru.shildtlearning.chapter10_Exceptions;

// Эта программа содержит ошибку, т.к. в последовательности catch-ей подкласс должен идти перед суперклассом,
// иначе будет создан недостижимый код - код, который никогда не выполнится. Это приведет к ошибке компиляции.
class Wrong_Catch_Example_5 {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 42 / a;
        } catch(Exception err) {
            System.out.println("Перехват обобщенного исключения Exception.");
        } //catch (ArithmeticException arithm_err) {
            // Эта конструкция catch() недостижима, т.к. ArithmeticException это подкласс Exception, и тот Exception
            // перехватит поэтому и все то, что должен был перехватывать ArithmeticException
          //  System.out.println("Это никогда не будет выведено");
        //}
    }
}
