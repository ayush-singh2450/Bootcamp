package LinkList;
import java.util.*;

class ListNode {
    int data;
    ListNode prev, next;

    ListNode(int data) {
        this.data = data;
        next=prev=null;
    }
}

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null, tail = null;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (!set.contains(x)) {
                set.add(x);

                ListNode newNode = new ListNode(x);

                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
            }
        }

        while (tail != null) {
            System.out.print(tail.data + " ");
            tail = tail.prev;
        }

        sc.close();
    }
}