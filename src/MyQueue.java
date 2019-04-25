public class MyQueue {
    static int intArray[] = {2, 32, 56, 600,45,67,89, 7, 8, 8};
    static int size = intArray.length;
    static int[] Queue = new int[20];
    static int front = -1;
    static int rear = -1;

    public static void main(String[] args) {

        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        }
        //elements enQueued
        System.out.println("enQueuing  order of elements");
        for (int pass:intArray
             ) {
            System.out.println(pass);
            enQueue(pass);

        }
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        }
        System.out.println("deQueuing  order of elements");
        //elments deQUeued
        System.out.println(deQueue());
        enQueue(2);

    }

    public static void enQueue(int item) {
        front = 0;
        Queue[++rear] = item;
    }

    public static int deQueue() {
        return Queue[front++];
    }
}
