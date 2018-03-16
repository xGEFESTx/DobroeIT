package Week_2;

public class HomeWork_3 {
    // программа, которая принимает на вход двумерный массив, печатает его содержимое и ничего не возвращает.
    // реализовано с помощью вложенных циклов.
    public static void main(String[] args) {
        int array [] [] = new int[6][6];

        // инициализируем случайными значаниями двумерный массив
        for (int i = 0; i < array.length; i ++){
            for (int k = 0; k < array [0].length; k++) {
                int rand = (int) (Math.random() * 10);
                array[i] [k] = rand;
            }
        }

        sameArray(array);
    }

    // метод который печатает данные в консоль
    private static void sameArray(int array [] []){
        for (int i[] : array ) {
            for (int k: i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
