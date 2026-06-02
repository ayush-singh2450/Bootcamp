package LinkList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteAtPos {
    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    static void deleteAtPosition(int pos) {
        if (head == null)
            return;

        if (pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        for (int i = 0; temp != null && i < pos - 1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            insert(sc.nextInt());

        int pos = sc.nextInt();

        deleteAtPosition(pos);

        display();
    }
}