package misc.fsc3;

import java.util.Scanner;

public class Revision1 {
    public static void main(String[] args) {

        // 37 - > 1 - 37 : 24 -> 2 * 12, 4 * 6, 24 * 1, 8 * 3

        System.out.println(solve2(16));

        // 32   16  8   4   2   1
        // 0    1   0   0   0   0
        //          1   1   1   1






    }

    /*

    A   B   A & B
    0   0   0
    0   1   0
    1   0   0
    1   1   1

     */

    public static int solve1(int []arr) {

        int ans = arr[0];

        for(int i=1;i<arr.length;i++) {
            ans ^= arr[i];
        }

        return ans;
    }

    public static int solve2(int n) {
        while ((n & (n -1)) != 0 ) {
            n = n & n - 1;
        }

        return n << 1;

    }
    // 16   8   4   2   1
    // 0    1   1   0   0
    // 0    1   0   1   1
    // 0    1   0   0   0

    // 32   16  8   4   2   1
    //  0   1   1   1   1   1
    //  0   1   1   1   1   0

    //  0   1   1   1   1   0 -> 30
    //  0   1   1   1   0   1


    //  0   1   0   0   0   0
    //  0   0   1   1   1   1



    public static void fibo(int n) {
        int t1 = 0, t2 = 1;

        /*if (n >= 1) {
            System.out.println(0);
        }

        if (n >= 2) {
            System.out.println(1);
        }*/

        int sum ;
        for (int i = 1; i <= n; i++) {
            System.out.println(t1);
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public static void factorial(int n) {

        int tempAns = 1;

        // Print all numbers from 1 - n
        for (int i = 1; i <= n; i++) {
            tempAns = tempAns * i;
        }

        System.out.println(tempAns);

    }

    public static void reverse (int n) {

        int q;
        int r;
        int ans = 0;

        while (n != 0) {
            q = n / 10; //123
            r = n % 10; //4
            ans *= 10;
            ans += r;
            n = q;
        }

        System.out.println(ans);

    }

    public static void hcfLcm(int a, int b) {

        int hcf = 0;
        int product = a * b;

        /*int max = Math.max(a, b);

        for (int i = max; i >= 1; i--) {
            if (max % i == 0) {
                hcf = i;
                break;
            }
        }*/

        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                if (b % i == 0) {
                    hcf = i;
                    break;
                }
            }
        }

        System.out.println(hcf);

        int lcm = product / hcf;

        System.out.println(lcm);
    }
    /*

    1234 -> 4321

    4000 + 300 + 20 + 1 ->


    1234 -> , 1; 40+3

     */


}
