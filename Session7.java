package misc.fsc3;

import java.util.Arrays;

public class Session7 {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 9, 8, 7, 6};
        mergeSort(arr);
        System.out.println("Result: ");
        System.out.println(Arrays.toString(arr));

        // 1, 2, 3, 4, 5, 6, 7, 8, 9
        //

        //                   ij
        // 2, 8, 7, 1, 3, 5, 6, || 14
        //
        // Rules :
        /*

        1. If the new element > pivot:
            Move j to j + 1
        2. If the new element <= pivot:

            j++

         */

        // 3, 1, 2, 6, 5, 9, 4,


        // |   3, 1, 2      | 4 | 6, 5, 9   |
        // 1. Pick a pivot
        // 2. Partition the array
        // 3. Place the pivot
        // 4. Return index of pivot
        // QA(left)
        //3, 1, 2
        // |  1 |2| 3 |
        //QS(left)
        // 1 ->

    }
    /*

    n -1
    n -2
    n -3
    n -4
    n - 5
    ..
    ...

    n - (n-1)

    ..

    1 + 2 + 3 + 4 ... + n = n * (n + 1) -> n^2

     */

    public static void bubbleSort(int[] arr) {

        boolean isDone;
        for (int j = 0; j < arr.length - 1; j++) {
            isDone = true;

            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] < arr[i + 1]) {
                    isDone = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //System.out.println(Arrays.toString(arr));

            if (isDone) {
                System.out.println("Finishing early...");
                break;
            }

        }

    }

    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i, minValue = arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] > minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            System.out.println("Min: " + minValue);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

            System.out.println(Arrays.toString(arr));

        }

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13
        //~n
        //+
        // n


    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            // 1, 4, 6, 7 | 5 | ....

            int pivot = arr[i]; // 5
            int j = i - 1; // 1
            while ((j >= 0) && (pivot < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pivot;
        }
    }

    /*





     */
    public static void merge(int []array, int[] left, int[]right) {

        int l = left.length;
        int r = right.length;

        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Right got exhausted
        while (i < l) {
            array[k++] = left[i++];
        }

        // Left got exhausted
        while (j < r) {
            array[k++] = right[j++];
        }

    }

    public static void mergeSort(int[] array) {

        int n = array.length;

        if (n == 1) {
            System.out.println("Base case hit:");
            System.out.println(Arrays.toString(array));
            return;
        }

        //1. Divide
        int mid = n / 2; // 3, 4
        int []left = new int[mid];
        int []right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for(int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        //2. Conquer
        mergeSort(left);
        mergeSort(right);

        //3. Combine
        merge(array, left, right);

        System.out.println("After combine:");
        System.out.println(Arrays.toString(array));


    }

    /*


        < X    |  X |   > X

        3rd smallest


        pivot - 5th


     */
    public static void quickSort(int[] array, int start, int end, int k) {
            int pivot = magicFunction(array, start, end);

            if (pivot == k -1) {
                System.out.println(array[pivot]);
            } else if (pivot > k -1) {
                quickSort(array, start, pivot - 1, k);
            } else {
                quickSort(array, pivot + 1, end, k);
            }
    }

    // 1, 2, 3, 4, 5, 6
    //SE

    private static int magicFunction(int[] array, int start, int end) {

        //  3 7 1 2 9 4 8 | 6
        //  s               e
        //  j             | e

        // 3 1 2 9 7 4 8 | 6
        // s           j
        //       i
        /*

        2 rules:
        A. If the element is larger than pivot -> Ignore and go ahead.
        B. If element is smaller than pivot ->
            i> i++ (Increase the boundary of the left zone)
            ii> With the automatic j++, the right zone gets one extra space

        Left zone => s - i
        Right zone => i+1  -  j-1
        Unexplored zone => j - e-1

         */


        //  <= 6 | 6 | > 6

        int pivot = array[end];
        int i = start - 1;


        for (int j = start; j < end; j++) {

            if (array[j] <= pivot) {
                //Left chunk
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    // 1. Pick a pivot
    // 2. Partition the array
    // 3. Place the pivot
    // 4. Return index of pivot

    /*

            i++
            Swap arr[i] with arr[j]


    MS(12, 3, 2, 7)
    MS(4, 12, 6, 1, 12, 3, 2, 7) - 153 [1, 4, 6, 12]
    MAIN()



     */



}
