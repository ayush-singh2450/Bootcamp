package StackAndQueue;

import java.util.*;

public class ReverseFirstK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for(int i=0;i<n;i++) {
            q.add(sc.nextInt());
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        // Push first k elements into stack
        for(int i=0;i<k;i++) {
            st.push(q.remove());
        }

        // Add back to queue
        while(!st.isEmpty()) {
            q.add(st.pop());
        }

        // Move remaining elements
        for(int i=0;i<n-k;i++) {
            q.add(q.remove());
        }

        System.out.println("Queue after reversing first K elements:");

        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        sc.close();
    }
}