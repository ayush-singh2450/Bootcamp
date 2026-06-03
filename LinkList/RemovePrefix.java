package LinkList;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemovePrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int prefix = sc.nextInt();

   
        while (head != null && head.data / 100 == prefix) {
            head = head.next;
        }

        Node temp = head;

        while (temp != null && temp.next != null) {
            if (temp.next.data / 100 == prefix) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

      
        temp = head;
        while (temp != null) {
            System.out.println("Roll: "+temp.data);
            temp = temp.next;
        }

        sc.close();
    }
}