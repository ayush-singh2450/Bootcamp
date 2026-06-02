package LinkList;

  import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class UpdateIndex {
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
        newNode.prev = temp;
    }

    static void update(int index, int value) {
        Node temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp != null)
            temp.data = value;
        else
            System.out.println("Invalid Index");
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
            insert(sc.nextInt());

        int index = sc.nextInt();
        int value = sc.nextInt();

        update(index, value);
        display();
    }
}
