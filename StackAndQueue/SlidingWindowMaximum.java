package StackAndQueue;

import java.util.*;

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();

        for(int i=0;i<n;i++){

            while(!dq.isEmpty() && dq.peekFirst() <= i-k)
                dq.pollFirst();

            while(!dq.isEmpty() &&
                  arr[dq.peekLast()] < arr[i])
                dq.pollLast();

            dq.offerLast(i);

            if(i >= k-1)
                System.out.print(arr[dq.peekFirst()]+" ");
        }
    }
}