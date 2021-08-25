package misc.fsc3;

public class Session1 {
    public static void main(String[] args) {

        int n = 102222, m = 195559;
        int x = n ^ 2;

        for(int i = n; i > 0; i = i/2) {
            // log(n)
        }

        // O(log n * log n)
        // O (log(n)^2)





        for(int i = n; i > 0; i = i/2) {
            System.out.println("Hello!");
        }

        // O(1 * log(n))




        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.println("Hello!");
            } // O(n*n)
        }

        //O(n * n)


    }
    /*

        x     |      n
        -------------
        0 + 10            1 -> 2^0
        1 + 1            2 -> 2^1
        2 + 1            4
        4            8
        y                   2^y
        log(y)              log(2^y) -> y * log(2) -> y
         log(n)                   n





        x           |           n
        0                       1 -> 3^0
        1                       3 -> 3^1
        2                       9 -> 3^2
        y                       3^y
        log(3)(n)                  log(3^y) -> y * log(3) -> y * 1 -> n



                     n





     */

}
