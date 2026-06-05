package StackAndQueue;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
;        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            int ans = st.isEmpty() ? -1 : st.peek();

            System.out.println(arr[i] + " - " + ans);

            st.push(arr[i]);
        }
    }
}
