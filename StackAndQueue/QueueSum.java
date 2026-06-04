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

public class QueueSum {
    Node front = null, rear = null;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void displayAndSum() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        int sum = 0;

        while (temp != null) {
        sum+=temp.data;
        temp=temp.next;
        }
        System.out.println("\nSum = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueSum q = new QueueSum();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            q.enqueue(sc.nextInt());
        }

        q.displayAndSum();
        sc.close();
    }
}