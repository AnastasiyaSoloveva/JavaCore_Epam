package homework.lesson170816;

import java.util.Arrays;
import java.util.Random;

public class RadixSort {


    public static void main(String[] args) {

        int[] array = new int[15];

        System.out.println(Arrays.toString(fill(array)));

        System.out.println(Arrays.toString(radixSort(array)));



    }



    public static int[] radixSort(int[] array){

        int R = 10;
        int N = array.length;
        int[] aux = new int[N];

        int max = max(array);


        for (int d = 1; (max / d) > 0 ; d*=10) {
            int[] count = new int[R +1];

            for (int i = 0; i < N ; i++) {
                count[(array[i]/d) % 10 + 1]++;
            }

            for (int r = 0; r < R ; r++) {
                count[r+1] += count[r];
            }

            for (int i = 0; i < N; i++) {
                aux[count[(array[i] / d) % 10]++] = array[i];
            }

            for (int i = 0; i < N; i++) {
                array[i] = aux[i];

            }

        }

        return array;

    }

    public static int[] fill(int[] a) {
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);

        }
        return a;

    }


    private static int max(int[] array) {
        int max = array[0];
        for(int value: array){
            if(value > max){
                max = value;
            }
        }

        return max;

    }


}
