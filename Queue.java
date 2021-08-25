package misc.fsc3;

public class Queue {

    private int[] queueArray;

    private int front;
    private int rear;

    private Stack stack;

    public Queue() {

    }

    public void create(int size) {
        this.stack.create(size);
        this.queueArray = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Overflow!");
        } else {
            rear = (rear + 1) % queueArray.length;
            queueArray[rear] = data;

            if (front == -1) {
                front = 0;
            }
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow!");
            return -99;
        }

        if (front == rear) {
            int temp = queueArray[front];

            front = -1;
            rear = -1;

            return temp;
        }

        int temp = queueArray[front];
        front = (front + 1) % queueArray.length;;

        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            return -99;
        } else {
            return queueArray[front];
        }
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public boolean isFull() {
         return ((rear + 1) % queueArray.length == front);
    }
}
