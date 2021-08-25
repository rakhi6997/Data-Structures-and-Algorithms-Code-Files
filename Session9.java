package misc.fsc3;

public class Session9 {

    public static Node engine = null; //head
    public static Node tail = null;

    public static void main(String[] args) {

        System.out.println();

        addFront(3);
        addFront(2);
        addFront(1);

        addEnd(4);
        print();

        addAfter(2, 10);
        print();

        System.out.println(deleteAfter(10));
        print();



    }

    /*

         engine =   4 ->3 -> 2 ->1 ->
         Node engine2 = ;
            engine  = engine2
     */


    public static void addFront(int x) {
        if (engine == null) {
            engine = new Node(x, null);
            tail = engine;
        } else {
            Node temp = new Node(x, null);
            temp.next = engine;
            engine = temp;

        }
    }

    // E 1 -> 2 -> 3 -> 4
    //


    /*

     1 -> 0        [ 3 | Address to 4 ]
     E    T


     */

    public static void addEnd(int x) {

        if (engine == null) {
            engine = new Node(x, null);
            engine.next = engine;
        } else {

            Node t = engine;

            while (t.next != null) {
                t = t.next;
            }

            Node newNode = new Node(x, engine);

            t.next = newNode;

        }
    }

    // 1 -> 2 -> 3 -> 4 -> 5 -> null
    // E                   T
        // Create new Node


    public static void addAfter(int data, int x) {
        Node t = engine;
        while (t != null) {
            if (t.data == data) {
                break;
            }
            t = t.next;
        }

        if (t == null) {
            return;
        }

        if (t.next == null) {
            addEnd(x);
            return;
        }

        Node node = new Node(x, null);
        node.next = t.next;
        t.next = node;
    }

    public static int deleteAfter(int data) {

        Node t = engine;

        if (engine == null || engine.next == null) {
            return -99;
        } else {

            while (t.next != null) {
                if (t.data == data) {
                    break;
                }
                t = t.next;
            }


            /*

            E 1 -> 2 -> 3 -> 4 -> 5 ->{1}


             */

            if (t.next == null) {
                return -99;
            } else if (t.next.next == null){
                return deleteEnd();
            } else {
                int temp = t.next.data;
                t.next = t.next.next;
                return temp;
            }
        }

    }


    public static int deleteFront() {
        int temp = -99;

        if (engine != null) {
            temp = engine.data;
            engine = engine.next;
        }

        return temp;
    }

    public static int deleteEnd() {

        Node t = engine;
        Node prev = null;

        if (engine == null) {
            return -99;
        } else if (engine.next == null) {
            int temp = engine.data;
            engine = null;
            return temp;
        } else {
            while (t.next != null) { //while (t.next != engine) {
                prev = t;
                t = t.next;
            }

            prev.next = engine; // prev.next = engine;
            return t.data;
        }
    }

    // 1 -> 2 -> 3 -> 4 -> {1}
    // 1 -> {1}

    public static void print() {

        if (engine == null) {
            return;
        }

        Node t = engine;

        do {

            System.out.print(t.data);
            t = t.next;

            if (t != null) {
                System.out.print(" -> ");
            }

        } while (t != engine);

        System.out.println();

    }


}
