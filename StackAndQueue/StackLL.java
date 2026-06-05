package StackAndQueue;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackLL {
    Node top = null;

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack.");
    }

   
    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped element: " + top.data);
        top = top.next;
    }
    void display() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println("Stack Elements:");
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLL stack = new StackLL();

        int choice;

        
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
while(true){
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        
        } 

        sc.close();
    }
}