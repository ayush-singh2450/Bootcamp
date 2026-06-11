package StackAndQueue;

import java.util.*;

class QueueArray {
    int[] queue;
    int front = -1, rear = -1;
    int size;

    QueueArray(int n) {
        size = n;
        queue = new int[size];
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;

            queue[++rear] = value;
            System.out.println(value + " inserted");
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " deleted");
            front++;
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QueueArray q = new QueueArray(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
