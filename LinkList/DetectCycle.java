package LinkList;


class DetectCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }


    boolean detectCycle() {

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }


    public static void main(String args[]) {

        DetectCycle list = new DetectCycle();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // creating cycle
        list.head.next.next.next.next = list.head.next;


        if(list.detectCycle())
            System.out.println("Cycle Found");
        else
            System.out.println("No Cycle");
    }
}