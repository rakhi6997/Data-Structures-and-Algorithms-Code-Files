package misc.fsc3;

public class Session12 {
    public static void main(String[] args) {

    }

    public static void sort(Queue queue) {
        if (!queue.isEmpty()) {
            int x = queue.dequeue();
            sort(queue);
            blackMagic(queue, x);
        }
    }

    /*

     */
    private static void blackMagic(Queue sortedQueue, int x) {


    }


    /*

    1 2 3 4

    main()

    temp -> 1
    4 3 2 1
    enqueue -> X

    temp -> 2
    4 3 2
    enqueue -> 2

    temp -> 3
    4 3
    enqueue -> 3

    temp -> 4
    [4]
    enqueue -> 4


     */

    public static void reverse(Queue queue) {
        if (!queue.isEmpty()) {
            int temp = queue.dequeue();
            reverse(queue);
            queue.enqueue(temp);
        }
    }



    /*

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








     */
}
