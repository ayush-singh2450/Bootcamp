package StackAndQueue;

import java.util.*;

public class FirstNegativeInWindow {

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

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){

            if(arr[i] < 0)
                q.add(i);

            while(!q.isEmpty() &&
                  q.peek() <= i-k)
                q.remove();

            if(i >= k-1){

                if(q.isEmpty())
                    System.out.print("0 ");
                else
                    System.out.print(arr[q.peek()]+" ");
            }
        }
    }
}