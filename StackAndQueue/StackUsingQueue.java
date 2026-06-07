package StackAndQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<>();
     Queue<Integer> q2 = new LinkedList<>();

     void push(int x){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(x);
          while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
     }

     void pop(){
        System.out.println("Deleted element"+q1.remove());
     }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     StackUsingQueue q = new StackUsingQueue();

        int choice;

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int x = sc.nextInt();
                    q.push(x);
                    break;

                case 2:
                    q.pop();
                    break;
                 case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);

        sc.close();
}
}

