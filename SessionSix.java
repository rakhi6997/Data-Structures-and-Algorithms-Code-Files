package misc.fsc3;

import java.util.Arrays;
import java.util.Scanner;

public class SessionSix {

    public static void main(String[] args) {
        // arr -> x (sorted && the values 0 -> m-1)
        // m > x 100
        // 100, 110
//1, 1, 2, 3, 4, 5, 6, 6, 7, 7, 8, 8, 8, 8, 8, 9

    }

    public static void solveBinarySearch(int []arr, int start, int end) {

        if (start > end) {
            System.out.println("No missing element!");
        }

        int middle = (start + end) / 2;

        if (start != arr[start]) {
            System.out.println("Found the missing element: " + start);
        }

        if (middle == arr[middle]) {

            solveBinarySearch(arr, middle + 1, end);
        } else {

            //0, 1, 3, 4, 5, 6, 7, 8
            solveBinarySearch(arr, start, middle);
        }


    }

    public static void solve(int []arr) {
        boolean complete = false;
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != i) {
                System.out.println("Smallest missing element found -> " + i);
                complete = true;
                break;
            }
        }

        if (!complete) {
            System.out.println("Nothing is missing!");
        }
    }
//1, 2, 3, 4, 5
    public static int binarySearch(int []arr, int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (key == arr[middle]) {
                System.out.println("Found!");
                return arr[middle];
            }

            if (key < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }

        }

        System.out.println("Element not found");
        return -9999;
    }

    public static int binarySearchRecursive(int []arr, int key, int start, int end) {


        if (start > end) {
            System.out.println("Element not found");
            return -9999;
        }

        int middle = (start + end) / 2;
        System.out.println("Middle calculated as: " + middle);

        if (key == arr[middle] && arr[middle+1] != key) {
            System.out.println("Found!");
            return arr[middle];
        }

        if (key < arr[middle]) {
            System.out.println("End adjusted to: " + (middle - 1));
            return binarySearchRecursive(arr, key, start, middle - 1);
        } else {
            System.out.println("Start adjusted to: " + (middle + 1));
            return binarySearchRecursive(arr, key, middle + 1, end);
        }

    }

}
