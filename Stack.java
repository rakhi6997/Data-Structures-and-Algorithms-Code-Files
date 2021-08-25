package misc.fsc3;

import java.util.Arrays;

public class Stack {

    private int[] stackArray;

    private int top;

    public static Node engine = null; //head

    public Queue queue;

    public Stack() {
    }

    public void create(int size) {
        queue.create(size);
    }

    /*

    Push 5 into 1
    Push 10 into 2
    Push 20 into 2
    Push 30 into 1
    Print() - ?
    Pop from 1 - ?
    Pop from 1 - ?
    Pop from 1 - ?

     */

    /*


       [                                      ]
            ^                   ^


    1 2 3 4 5 20 40 30 10 9 1 2 3
            T1            T2

     */



    public void push(int data) {


        if (engine == null) {
            engine = new Node(data, null);
        } else {
            Node temp = new Node(data, null);
            temp.next = engine;
            engine = temp;
        }

        queue.enqueue(data);
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Underflow!");
            return -99;
        } else {
            int temp = engine.data;
            engine = engine.next;
            return temp;
        }
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Underflow!");
            return -99;
        } else {
            return engine.data;
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public boolean isFull() {
        return queue.isFull();
    }

    public void print() {

        if (engine == null) {
            return;
        }

        Node t = engine;

        while (t != null) {

            System.out.print(t.data);
            t = t.next;

            if (t != null) {
                System.out.print(" -> ");
            }

        }

        System.out.println();


    }

    /*

    6 2 3 1 9 15 4 \\



    int func(s) {

    if (stack has 1 value)
    {
     return;
    }

    x = pop()
    y = pop()
    int max = Math.max(x, y)
    push(max)

    func(s)



    }

    6 2 3 1 9 15 4 \\

    1. I/P = 6 2 3 1 9 15 4 \\       x = 2;  6 3 1 9 15 4 \\
    2. I/P = 6 3 1 9 15 4 \\        x = 3; 6 1 9 15 4 \\
    3. I/P = 6 1 9 15 4 \\        x = 1; 6 9 15 4 \\
    4. I/P = 6 9 15 4 \\        x = 6; 9 15 4 \\
    5. I/P = 9 15 4 \\        x = 9; 15 4 \\ -> 4    4 6 9 15 \\
    6. I/P = 15 4 \\        x = 4; 15 \\



     */


}
