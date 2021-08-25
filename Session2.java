package misc.fsc3;

import java.util.Scanner;

public class Session2 {
    public static void main(String[] args) {

        //System.out.println(decimalToBinary(150));
        Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        //solve(n);
        // Take in some number, and print out the bit reversed equivalent.
        // 5 -> 101 -> 010 -> 2
        System.out.println(decimalToBinary(142));
        //String s = "10010110";

        //123

        //binaryToDecimal(s);

        String x = "120";

        int y = Integer.parseInt(x);
        //System.out.println(y + 100);

        //addition(220, 23);


        /*

        1   0   0   1   1   1 ->
        0   1   0   1   1   0
        ---------------------------------
        0   0   1   1   0   0
        1   1   0   0   0   1
        ----------------------
        1   1   1   1   0   1





                (1)
       2        3       5
       7        5       8
       -------------------
       9        8       3
       0        1       0
       -----------------
       9         9        3

       1. Do the basic add -> XOR
       2. Compute the carry -> AND , Left Shift
       3. Add the carry to the basic add..


011
100

        8       4       2       1
                1       0       0
         */
    }

    public static void solve(int n) {
        String binaryEquivalent = decimalToBinary(n);
        System.out.println(binaryEquivalent);

        String reversedBits = "";

        for (int i = binaryEquivalent.length() - 1; i >= 0 ; i--) {
            char c = binaryEquivalent.charAt(i);
            reversedBits += c + ""; // rev = 01 + 1

        }

        System.out.println(reversedBits);

        binaryToDecimal(reversedBits);
    }



    public static String decimalToBinary(int decimal) {
        int index = 0;

        String binary = "";
        while (decimal > 0) {
            int q = decimal / 2;
            int r = decimal % 2;
            binary = r + binary;
            decimal = q;
            index ++;
        }

        return binary;
    }

    public static void binaryToDecimal(String s) {

        int product = 1; //2^0
        int decimal = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            char digit = s.charAt(i);

            int temp = Integer.parseInt(digit + "");
            //System.out.println("Obtained digit -> " + temp);
            //System.out.println("Multiplying it with " + product);

            decimal += temp * product;
            product *= 2;
            //System.out.println("Updated product to " + product);
        }

        System.out.println(decimal);

    }

    public static void addition(int a, int b) {
        while (b != 0) {
            int carry = a & b;

            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }

    /*




     */
}
