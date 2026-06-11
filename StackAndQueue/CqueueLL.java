package StackAndQueue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class QueueLL {

    Node front, rear;

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(value + " inserted");
    }


    void dequeue() {

        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted");

        front = front.next;

        if (front == null)
            rear = null;
    }


    void display() {

        if (front == null) {
            System.out.println("Queue Empty");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");

        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}


public class CqueueLL {
    public static void main(String[] args) {

        QueueLL q = new QueueLL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();

        q.display();
    }
}
