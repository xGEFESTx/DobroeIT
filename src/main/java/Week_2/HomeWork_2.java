package Week_2;

// напсать метод, который принимает на вход массив целых чисел и возвращает сумму тех, которые делятся на 2 без остатка.

public class HomeWork_2 {

    public static void main(String[] args) {

        // создаем и инициализируем случайный массив который будем передавать в метод
        int array[] = new int[3];

        for (int i = 0; i < array.length; i++) {
            int rand = (int) (Math.random() * 200);
            array[i] = rand;
        }

       System.out.println("Сумма чисел которые делятся на 2 без остачи равна: " + sum(array));
    }

    // метод, который принимает на вход массив целых чисел и возвращает сумму тех, которые делятся на 2 без остатка.
    private static int sum (int array[]){

        int sum = 0;
        for (int i: array)
            if (i % 2  == 0){
                sum += i;
            }
            return sum;
        }

    }
