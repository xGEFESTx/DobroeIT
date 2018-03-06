package Week_1;

public class HomeWork_1 {
    /*
    1) Написать программу создающую три целочисленные переменных с произвольными значениями и выводящую на консоль
        сумму трех переменных;
    2) Создать переменную с произвольным символом. Конвертировать символ в число и вывести результат на консоль
    3) Создать программу конвертирующую более узкий тип к более широкому;
    4) Создать программу, конвертирующую более широкий тип к более узкому. Создать ситуацию, в которой
        часть данных более широкого типа теряется;
    5) Создать по 1 переменной каждого из примитивных типов
     */
    public static void main(String[] args) {

        // создание трех целочисленные переменных с произвольными значениями и вывод на консоль суммы трех переменных
        int a = 5;
        int b = 15;
        int c = 25;
        System.out.println("Сумма чисел a+b+c=" + (a + b + c));
        System.out.println();


        // переменная с произвольным символом конвертируется в число и выводится результат на консоль
        char symbol = 'z';
        int symbolToNum;
        symbolToNum = Integer.valueOf(symbol);
        System.out.println("Перемення \"char symbol\" которая проинициализирована символом \'z\' после конвертации в число равна: " + symbolToNum);



        // конвертирование более узкого типа к более широкому
        int numberInt = 10;
        long numberIntToLong;
        float numberFloat = 5.55f;
        double numberFloatToDoubl;
        numberIntToLong = numberInt;     // преобразование int в long
        numberFloatToDoubl = numberFloat;  // преобразование float в double

        // конвертация более широкого типа к более узкому с потерей части данных
        float numberOne = 15.5f;
        int numberTwo;
        numberTwo = (int)numberOne; // перевод числа с типа float в тип int с потерей дробной части => 0.5


        // создание переменных примитивного типа
        boolean w = true;
        byte numberByte = 12;
        short numberShort = 25;
        char sameSymbol = 'G';
        int numbersInt = 350;
        long numberLong = 450;
        float numbersFloat = 3.6f;
        double numberDouble = 5.6545;
    }
}
