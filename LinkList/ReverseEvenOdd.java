package LinkList;
import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
    
public class ReverseEvenOdd {

    static Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            head = insertAtHead(head, val);
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0)
                System.out.print(temp.data + " ");
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (temp.data % 2 != 0)
                System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

