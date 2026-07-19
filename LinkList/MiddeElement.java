//package LinkList;
import java.util.Scanner;

class ListNode{
    int val1;
    ListNode next;

    ListNode(int val1) {
        this.val1 = val1;
        this.next = null;
    }
}
public class MiddeElement {

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Linked List is empty.");
            return;
        }

        System.out.print("Enter node values: ");

        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        ListNode middle = middleNode(head);

        System.out.println("Middle Node: " + middle.val1);
    }
}
