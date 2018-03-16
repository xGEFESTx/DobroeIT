package Week_2;



public class HomeWork_1 {
    public static void main(String[] args) {
        // присваиваем 3-м числам случайные значения
        int a = (int) (Math.random()*200 - 100);
        int b = (int) (Math.random()*200 - 100);
        int c = (int) (Math.random()*200 - 100);

        System.out.println("Сумма положительных чисел равна: " + sum(a, b, c));
    }

    //метод, который получает на вход 3 числа и возвращает сумму лишь положительных из них.
    // К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).

    private static int sum(int a, int b, int c){

        int sum = 0;

        if (a >= 0 && b >= 0 && c >= 0 ){
            sum = a + b + c;
        }
        else if (a >= 0 && b >= 0 && c < 0 ){
            sum = a + b;
        }
        else if (a >= 0 && b < 0 && c >= 0 ){
            sum = a + c;
        }

        else if (a < 0 && b >= 0 && c >= 0 ){
            sum = b + c;
        }

        else if (a < 0 && b < 0 && c >= 0 ){
            sum = c;
        }

        else if (a < 0 && b >= 0 && c < 0 ){
            sum = b;
        }

        else if (a >= 0 && b < 0 && c < 0 ){
            sum = a;
        }

        else {
            sum = 0;
        }

        return sum;
    }
}
