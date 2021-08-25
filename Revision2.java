package misc.fsc3;

import java.util.HashMap;

public class Revision2 {
    public static void main(String[] args) {

        /*


        Array -

        min,  max, secondMin, secondMax, ....


        1, 10, 2, 9, 3, 8, 4, ....

        key = 7






        1. Swapping 2 numbers - Third way
        2. main points which we should have in mind while solving array problems
        3. HW question


        0 0  0
        0 1  1
        1 0  1
        1 1  0

        1. x ^ x = 0
        2. x ^ 0 = x

  */
        generate("", 3);


    }


    /*
        1. 'n' -> Print all possible binary strings of size 'n'
         that do not have consecutive 1's.

         2. Median of the combination of 2 sorted arrays of the same size
         (without using a third array)
         1, 3, 5, 7, 9 and 2, 4, 6, 8, 10

         2, 4, 6, 8   1, 2, 3, 4
         1, 2, 2, 3, 4, 4, 6, 8 -> 3.5




         until both the arrays just have 1 element each {

         m1 ->
         m2 ->

         if (m1 == m2)
            return m1;

         if () // arr1 -> 1 element arr2 -> 1 element
            // average of 2 elements

            A. start1 == end1
            B. start2 == end2
            C. start1 == end1 && start2 == end2 - 7
            D. start1 == end1 || start2 == end2 - 1
            E. All of the above





         if (m1 > m2)
         solve (arr1, arr2, start1, start2(x), end1(x), end2)

         if (m2 > m1)
            solve (arr1, arr2, start1(x), start2, end1, end2(x))



         }


         solve (arr1, arr2, start1, start2, end1, end2)




         1, 2, 3, 4, 5 and 100, 200, 300, 400, 500

          5,  and  6,
         1, 2, 3, 4, 5, 6, 7, 8, 20, 200 ->5.5



         10, 20, 30, 40, 50 and 1, 2, 30, 400, 500

         4, 6, 8, 12, 24 and 1, 2, 3, 4, 5
         1, 2, 3, 4, 4, 5, 6, 8, 12, 24 -> 4.5

         4 and 5




     */

    public static void solve1(int n) {

    }

    public static void generate(String s, int n) {
        if(0 == n) {
            System.out.println(s);
        } else {
            generate("0" + s, n - 1);
            if (s.length() == 0) {
                generate("1" + s, n - 1);
            } else if (s.charAt(0) == '0') {
                generate("1" + s, n - 1); //
            }
        }
    }

}
