package StackAndQueue;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class NStacks{
    Node[] top;
    NStacks(int n){
        top = new Node[n];
    }
    void push(int stackNo,int data){
        Node newNode = new Node(data);
        newNode.next=top[stackNo];
        top[stackNo]=newNode;

        System.out.println(data+" Inserted into stack"+(stackNo+1));
    }

    void pop(int stackNo) {

        if (top[stackNo] == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted Element: " + top[stackNo].data);
        top[stackNo] = top[stackNo].next;
    }

    void display(int stackNo) {

        if (top[stackNo] == null) {
            System.out.println("Stack Empty");
            return;
        }

        Node temp = top[stackNo];

        System.out.print("Stack " + (stackNo + 1) + ": ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Stacks: ");
        int n = sc.nextInt();

        NStacks st = new NStacks(n);

        int choice;

        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Stack Number (1-" + n + "): ");
                    int stackNo = sc.nextInt();

                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();

                    st.push(stackNo - 1, data);
                    break;

                case 2:
                    System.out.print("Enter Stack Number (1-" + n + "): ");
                    stackNo = sc.nextInt();

                    st.pop(stackNo - 1);
                    break;

                case 3:
                    System.out.print("Enter Stack Number (1-" + n + "): ");
                    stackNo = sc.nextInt();

                    st.display(stackNo - 1);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}