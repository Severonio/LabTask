package Lab2;


import java.util.Arrays;
import java.util.Comparator;

public class tsk3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 23, 3, 8, 2, 4, 4};
        Arrays.parallelSort(numbers);
        System.out.println("Odno: " + Arrays.toString(numbers));
        //Arrays. тільки з одновимірним
//        int[][] arr1 = {{1 , 8, 0}, {9, 2, 10}, {4, 6, 7}};
//        Arrays.sort(arr1, Comparator.comparingInt(arr -> arr[1]));
//        for (int[][] arr: arr1) {
//            System.out.println(arr + " ");
//        }
    }
}
