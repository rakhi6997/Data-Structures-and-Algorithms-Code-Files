package misc.fsc3;

public class Calculator {
    /*

    24 -> 4.

    2 * 12
    3 * 8
    4 * 6
    --------
    6 * 4
    8 * 3
    12 * 2


    16 ->

    2 * 8
    4 * 4
    8 * 2
     */

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isPrime(int n) {

        boolean isPrime = true;

        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {


            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        ////
        return isPrime;

    }

    public void primeFactorise(int n) {

        while (n % 2 == 0) {
            System.out.print("2"); // Store in DS (2)
            n /= 2;
            if (n != 1) {
                System.out.print(" x ");
            }
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {

            while (n % i == 0) {
                System.out.print(i);
                n /= i;
                if (n != 1) {
                    System.out.print(" x ");
                }
            }

        }

        if (n > 2) {
            System.out.print(n);
        }

    }

    public void chopNumbers(int n) {

        int sum = 0;
        int count = 0;
        int max = -1;


        while (n != 0) {

            int digit = n % 10;
            n /= 10;

            sum += digit;

            count++;

            if (digit > max) {
                max = digit;
            }


        }

        System.out.println("Sum = " + sum);
        System.out.println("No of Digits = " + count);
        System.out.println("Max Digit = " + max);

    }

    public boolean isArmstrong(int n) {

        int temp = 0;
        int copy = n;

        while (n != 0) {

            int digit = n % 10;
            n /= 10;

            temp += digit * digit * digit;

        }

        if (copy == temp) {
            return true;
        } else {
            return false;
        }
    }

    public int power(int n, int p) {

        int prod = 1;

        for(int i = 1; i <= p; i++) {
            prod *= n;
        }

        return prod;

    }

    public int mod(int n, int d) {

        /*

        17 % 5

        q = 17 / 5 -> 3
        temp  = 5 * 3 = 15
        return n - temp

         */
        int q = n / d;
        int temp = d * q;
        return n - temp;
    }

    public boolean isAutomorphic(int n) {

        int sq = n * n;
        int copy = n;

        int count = 0;

        while(n != 0) {
            n /= 10;
            count++;
        }

        int temp = sq % (int) Math.pow(10, count);

        if (temp == copy) {
            return true;
        } else {
            return false;
        }

    }

    public int noOfSquares(int n) {

        // l = 10, u = 36


        // 9 -> 1 * 9, 3 * 3 -> 1, 3, 9 -> ODD
        // 14 -> 1 * 14, 2 * 7- > 1, 2, 7, 14 -> EVEN
        // 16 -> 1 * 16, 2 * 8, 4 * 4 -> 1, 2, 4, 8, 16 -> ODD
        return (int) Math.floor(Math.sqrt(n));


    }

}
