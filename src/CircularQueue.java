public class CircularQueue {
    static int intArray[] = {2, 3, 6, 78, 54, 67, 1, 8};
    static int size = intArray.length;
    static int front = -1;
    static int rear = -1;
    static int queue[] = new int[8];

    public static void main(String[] args) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue full");
        }
        for (int a:
             intArray) {
            enQueue(a);
        }
       if (front==-1&&rear==-1){
            System.out.println("Queue underflow");
        }
        System.out.println("unDequeud");
        for (int a:queue
                ) {
            System.out.println(a);
        }
        System.out.println("dequeued first element="+deQueue());
        System.out.println("dequeued second element="+deQueue());
        System.out.println("enQueuing 12 and 42");
        enQueue(12);
        enQueue(42);
        System.out.println("modified Queue");
        for (int a:queue
             ) {
            System.out.println(a);
        }
    }


    public static void enQueue(int p) {
        front = 0;
        rear=(++rear)%size;
        queue[rear]=p;

    }

    public static int deQueue() {

        return intArray[(front++)%size];
    }
}
