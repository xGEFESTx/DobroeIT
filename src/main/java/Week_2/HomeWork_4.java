package Week_2;

//Написать функцию, принимающую на вход целое число,
// и возвращающую факториал данного числа. *Написать две версии программы(итеративную и рекурсивную)

public class HomeWork_4 {
    public static void main(String[] args) {
        int k = (int) (Math.random()*10) + 1 ;

        System.out.println(fackorial(k));
        System.out.println(recFactorial(k));

    }

    // итеративная версия
    private static int fackorial(int k){
        int result = 1;
        for (int i = 1; i <= k; i++){
            result = result * i;
        }

        return result;
    }


    // рекурсивный метод
    private static   int recFactorial(int n) {
        int result;

        if (n == 1) {
            return 1;
        }
        result = recFactorial(n - 1) * n;

        return result;
    }
}
