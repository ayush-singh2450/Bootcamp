package StackAndQueue;
import java.util.Scanner;

public class ReverseString{
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}
    Node top = null;

    void push(char ch) {
        Node newNode = new Node(ch);
        newNode.next = top;
        top = newNode;
    }

  
    char pop() {
        char ch = top.data;
        top=top.next;
        return ch;
    }

    boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseString stack = new ReverseString();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                stack.push(ch);
            } else {
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}