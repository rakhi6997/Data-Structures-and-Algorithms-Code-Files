package misc.fsc3;

public class Session10 {

    public static DoubleNode engine = null; //head


    public static void main(String[] args) {

        addFront(5);
        addFront(4);
        addFront(3);
        addFront(2);
        addFront(1);

        addEnd(6);
        prettyPrint();

        System.out.println(deleteFront());

        prettyPrint();
    }

    public static void addFront(int x) {
        if (engine == null) {
            DoubleNode newNode = new DoubleNode(x, null, null);
            engine = newNode;
        } else {
            DoubleNode temp = new DoubleNode(x, engine, null);
            engine.prev = temp;
            engine = temp;
        }

        /*
         0 = 1 = 2 = 3
         E

         */
    }

    public static void addEnd(int x) {

        if (engine == null) {
            DoubleNode newNode = new DoubleNode(x, null, null);
            engine = newNode;
        } else {
            DoubleNode t = engine;
            while (t.next != null) {
                t = t.next;
            }

            DoubleNode newNode = new DoubleNode(x, null, t);
            t.next = newNode;
        }
    }

    /*

    e 1 -> 2 -> 3 -> 4

    public static void addEnd(int x) {

        if (engine == null) {
            engine = new Node(x, null);
            engine.next = engine;
        } else {

            Node t = engine;

            while (t.next != engine) {
                t = t.next;
            }

            Node newNode = new Node(x, engine);

            t.next = newNode;

        }
     */

    public static int deleteFront() {

        int temp = -99;

        if (engine != null) {

            if (engine.next == null) {
                temp = engine.data;
                engine = null;
                return temp;
            }

            engine.next.prev = null;
            temp = engine.data;
            engine = engine.next;

        }

        return temp;

    }

    /*

    public static int deleteFront() {
        int temp = -99;

        if (engine != null) {
            temp = engine.data;
            engine = engine.next;
            tail.next = engine;
        }

        return temp;
    }
     */

    public static void print() {

        if (engine == null) {
            return;
        }

        DoubleNode t = engine;

        do {

            System.out.print(t.data);
            t = t.next;

            if (t != null) {
                System.out.print(" -> ");
            }

        } while (t != engine);

        System.out.println();

    }

    public static void prettyPrint() {

        if (engine == null) {
            return;
        }
        DoubleNode t = engine;
        while (t.next != null) {
            System.out.print(t.data);
            t = t.next;
            System.out.print(" -> ");
        }

        while (t != null) {

            System.out.print(t.data);
            t = t.prev;
            if (t != null) {
                System.out.print(" -> ");
            }

        }

        System.out.println();

    } // 1 2 3 4 -> 1 2 3 4 3 2 1
}
