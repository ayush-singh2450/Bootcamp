package LinkList;

import java.util.Scanner;

    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class CountElements {
    static Node head=null;

    static void insert(int data){
        Node newNode = new Node(data); 
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static int countNode(){
        int count=0;
        Node temp = head;
   
        while(temp!=null){
            count++;
             temp=temp.next;
        }
        return count;
           
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        while((x=sc.nextInt())!=-1){
            insert(x);
        }
        System.out.println("Total elements:"+countNode());
    }

}
