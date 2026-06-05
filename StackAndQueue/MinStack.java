package StackAndQueue;
import java.util.Scanner;
import java.util.Stack;

public class MinStack {

    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    static void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }

        System.out.println(x + " pushed into stack");
    }

    static void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }

        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        System.out.println("Popped element: " + removed);
    }

    static void getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Minimum Element: " + minStack.peek());
        }
    }

    static void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n----- MIN STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Minimum");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element: ");
                    int value = sc.nextInt();
                    push(value);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    getMin();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}