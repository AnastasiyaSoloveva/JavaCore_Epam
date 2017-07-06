package classwork.lesson170704;


import java.util.Random;

public class PrintArray {
    public static void main(String[] args) {

        Random random = new Random();
        int m = random.nextInt(20);
        int[] array = new int[m];
        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(100);

        }

        printArray(array);

    }


    // вывод массива на печать в виде  [0, 1, 2]
    private static void printArray(int[] array) {
        System.out.print("[");
        if (array.length == 0) {
            System.out.println("]");
        }
        for (int i = 0; i < array.length; i ++) {
            if (i == array.length-1){
                System.out.println(array[array.length-1] + "]");
                break;

            }
            System.out.print(array[i] + ", ");
        }
    }
}
