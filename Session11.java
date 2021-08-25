package misc.fsc3;

import java.util.Scanner;

public class Session11 {
    public static void main(String[] args) {

        //fun(stack);

        Stack stack1 = new Stack();
        stack1.push(5);
        stack1.push(7);
        stack1.push(2);
        stack1.push(9);
        stack1.push(3);
        stack1.push(15);
        stack1.push(50);
        stack1.push(1);
        stack1.push(8);

        stack1.print();
        rev(stack1);
        stack1.print();
    }

    /*

    fun(5) -> mi(5) -> mi(4) -> mi(3) -> mi(2) -> mi(1)
    fun(4) -> mi(4) -> mi(3) -> mi(2) -> mi(1)
    fun(3) -> mi(3) -> mi(2) -> mi(1)
    fun(2) -> mi(2) -> mi(1)
    fun(1) -> mi(1)


     */

    public static void fun(Stack s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            fun(s);
            magicallyInsert(s, x);
        }
    }

    public static void magicallyInsert(Stack s, int x) {
        if (s.isEmpty() || x <= s.peek()) {
            s.push(x);
        } else {
            int temp = s.pop();
            magicallyInsert(s, x);
            s.push(temp);
        }
    }


    public static void rev(Stack s) { // 1 2 3 4
        if (!s.isEmpty()) {
            int x = s.pop(); // x = 1 || 2 3 4
            rev(s); // 4 3 2
            magic(s, x); // 4 3 2 || 1
        }
    }

    public static void magic(Stack s, int x) {
        if (s.isEmpty()) {
            s.push(x);
        } else {
            int temp = s.pop();
            magic(s, x);
            s.push(temp);
        }
    }

    // 1 2 3 || 6

    // 1      2 3  || 6
    // 2      3 || 6

    // 3       [] || 6
    // [1 2 3 6]


    /*

            "[3+{}}5*(5/6)]/5"

            "(2 + 3))(" - false
            " (2 + 3}" - false
            "((5 + 3))" - true
            "[][5+ 3]" - false
            boolean isClosingAllowed = true

            ((((((sdfgsdf { awdesd [ afsdsd] })


     */


    /*

    4. Given just 1 array of n elements length, we want to implement
        2 stacks inside this array







     */

    public static boolean isLoopPresent(Node engine) {
        return true;
    }



}
