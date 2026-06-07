package StackAndQueue;

import java.util.*;

public class LargRectInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
        int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
         }
         Stack<Integer> s = new Stack<>();
         int right[] = new int[n];
         int left[] = new int[n];
         for (int i = n-1; i>=0; i--) {
             while(!s.empty() && arr[s.peek()]>=arr[i])
                s.pop();
            right[i]=s.empty()? n:s.peek();
            s.push(i);         
         }
         while(!s.empty())
            s.pop();

           for (int i = 0; i<n; i++) {
             while(!s.empty() && arr[s.peek()]>=arr[i])
                s.pop();
            left[i]=s.empty()? -1:s.peek();
            s.push(i);         
         }
         int ans=0;
         for (int i = 0; i<n; i++){
            int currArea = arr[i] * (right[i]-left[i]-1);
            ans=Math.max(ans,currArea);
         }
         System.out.print(ans);
         sc.close();
        }
    
}
