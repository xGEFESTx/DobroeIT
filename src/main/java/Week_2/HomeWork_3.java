package Week_2;

public class HomeWork_3 {
    // программа, которая принимает на вход двумерный массив, печатает его содержимое и ничего не возвращает.
    // реализовано с помощью вложенных циклов.
    public static void main(String[] args) {
        int array [] [] = new int[6][6];


        for (int i = 0; i < array.length; i ++){
            for (int k = 0; k < array [0].length; k++) {
                int rand = (int) (Math.random() * 10);
                array[i] [k] = rand;
                System.out.print(array [i] [k] + " ");
            }
            System.out.println();
        }

    }
}
