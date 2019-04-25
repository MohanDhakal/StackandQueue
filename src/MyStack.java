import java.util.Scanner;

public class MyStack {
    static int stackArray[] = new int[6];
    static int top = -1;

    public static void main(String[] args) {
        //intArry size is 11
        Scanner sc = new Scanner(System.in);
        int size = stackArray.length;
        System.out.println(size);
        //push
        System.out.println("Enter elements to push to stack");
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        }
        while (top < size - 1) {
            int item = sc.nextInt();
            push(item);
        }
        //pop
        System.out.println("Popping elements");
        if (top == -1) {
            System.out.println("Stack Underflow");
        }
        while (top > -1) {
            System.out.println(pop());
            top--;
        }
    }

    public static void push(int item) {
        stackArray[++top] = item;
    }

    public static int pop() {
        return stackArray[top];
    }
}
