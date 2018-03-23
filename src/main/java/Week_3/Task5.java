package Week_3;

public class Task5 {
    public static void main(String[] args) {
        int [] arr = {0, 0, 3};
        int[] newArr = sameArray(arr);
        for (int i: newArr){
            System.out.println(i);
        }

    }

    public static int[] sameArray(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++){
            if(array[i] > max)
                max = array[i];

            if(array[i] < min)
                min = array[i];
        }

        if (min < 0){
            System.out.println("Введенное число меньше 0");
            return  array;
        }

        if  (max > 100){
            System.out.println("Введенное число больше 100");
            return array;
        }

        // вариант без вложенных циклов
        int arr[] = new int[max+1];
        for (int num = 0; num < array.length; num ++){
            arr[array[num]] += 1;
        }

//      вариант решения задачи со вложенными циклами
//        int arr[] = new int[max+1];
//
//            for (int number = 0; number < array.length; number++) {
//                int count = 0;
//                for (int num = 0; num < array.length; num++) {
//
//                    if (array[number] == array[num]) {
//                        count++;
//                    }
//                }
//                int num = array[number];
//                arr[num] = count;
//            }

        return arr;
    }
}
