package classwork.lesson170811;

import java.util.Arrays;


public class BinarySearchAlgorithm {

    public static void main(String[] args) {


        int[] array = new int[]{46,2,60,0,-5,1,30,45,4};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        int index = binarySearch(array,5);
        System.out.println(index);

        int indx = Arrays.binarySearch(array,5);
        System.out.println(indx);


    }




    public static int binarySearch(int[] array, int value){
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (value < array[mid]) {
                hi = mid - 1;
            }
            else if (value > array[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }

        int index = 0;
        while(value > array[index]){
            index++;
        }
        return -(index +1);
    }


}
