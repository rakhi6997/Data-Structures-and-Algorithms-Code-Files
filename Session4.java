package misc.fsc3;

public class Session4 {


    public static void main(String[] args) {

        solve(2);

        /*



        12321
      1234



         */

    }

    public static void solve (int n) {

    }

    public static int hcf (int n1, int n2) {

        while (n1 != n2) {

            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }

        return n2;
    }

    public static int gcd(int n1, int n2) {

        System.out.println("Method gcd called with n1 = " + n1 + " and n2 = " + n2);

        // Base Case -
        if (n1 == n2) {
            System.out.println("Base case hit! Returning n2 = " + n2);
            return n2;
        }

        // Recursive Call
        if (n1 > n2) {
            System.out.println("Recursive case hit! n1 > n2. Calling gcd with " + (n1 - n2) + " and " + n2);
            int ans = gcd(n1 - n2, n2);
            System.out.println("Answer received for gcd(" + (n1 - n2) + ", " + n2 + " which returned " + ans);
            return ans;
        } else {
            System.out.println("Recursive case hit! n2 > n1. Calling gcd with " + n1 + " and " + (n2 - n1));
            int ans = gcd(n1, n2 - n1);
            System.out.println("Answer received for gcd(" + (n1) + ", " + (n2 - n1) + " which returned " + ans);
            return ans;
        }



    }

    public static int factorial (int n) {

        if (n < 0) {
            System.out.println("Invalid!");
            return -1;
        }

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);

    }

    public static int nThFibo(int n) {

        if (n <= 0) {
            System.out.println("Invalid!");
            return -1;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 1;
        }


        return nThFibo(n - 1) + nThFibo(n - 2);


    }

    public static int sumOfDigits(int n) {

        if (n < 0) {
            System.out.println("Invalid!");
            return -1;
        }

        if (n < 10) {
            return n;
        }

        return n % 10 + sumOfDigits(n / 10);
    }





}
