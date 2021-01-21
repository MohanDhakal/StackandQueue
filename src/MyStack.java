import java.util.Scanner;

public class MyStack {
    //initializing an array
    static int stackArray[] = new int[6];
    //position of the  current index
    static int top = -1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = stackArray.length;
        System.out.println(size);
        //push
        System.out.println("Enter elements to push to stack");
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        }
        while (top < size - 1) {
            //takes input from the user in the console
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
        }
    }

    public static void push(int item) {
        //preincreement of top before pushing an item
        //first increase the index and then push the item
        stackArray[++top] = item;
    }

    public static int pop() {
        return stackArray[top];
        top--;
    }
}
