package misc.fsc3;

import java.util.Arrays;
import java.util.Scanner;

public class Session5 {


    public static void main(String args[] )  {
        //reverse(-12345, 0);
        int []arr = {1, 2, 3, 4, 5};
        fun(arr);
    }

    public static void printXthPosition(int[] arr, int x) {
        System.out.println(arr[x]);
    }

    public static void fun(int[] arr) {

        int temp = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            System.out.println(Arrays.toString(arr));
        }

        arr[0] = temp;


        System.out.println(Arrays.toString(arr));

    }


}
