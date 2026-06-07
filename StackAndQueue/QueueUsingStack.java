package StackAndQueue;
  import java.util.*;
public class QueueUsingStack {
  
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        while(!s1.empty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(x);
         while(!s2.empty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }

    void dequeue() {
        
        System.out.println("Deleted Element: " + s1.pop());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     QueueUsingStack q = new QueueUsingStack();

        int choice;

        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Element: ");
                    int x = sc.nextInt();
                    q.enqueue(x);
                    break;

                case 2:
                    q.dequeue();
                    break;
                 case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
}
}


