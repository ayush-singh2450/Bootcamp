package StackAndQueue;

import java.util.*;

class CircularQueue {
    int[] queue;
    int front = -1, rear = -1;
    int size;

    CircularQueue(int n) {
        size = n;
        queue = new int[size];
    }

    // Insert element
    void enqueue(int value) {

        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
        System.out.println(value + " inserted");
    }


    // Delete element
    void dequeue() {

        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(queue[front] + " deleted");

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
    }


    // Display
    void display() {

        if (front == -1) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.print("Queue: ");

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        CircularQueue q = new CircularQueue(n);

        int ch;

        do {
            System.out.println("\n1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch(ch) {

                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(ch != 4);

        sc.close();
    }
}