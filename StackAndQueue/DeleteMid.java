package StackAndQueue;

import java.util.*;

public class DeleteMid {

    static void deleteMid(Stack<Integer> st, int current, int size) {

        if(current == size / 2) {
            st.pop();
            return;
        }

        int x = st.pop();

        deleteMid(st, current + 1, size);

        st.push(x);
    }

    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

       System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            st.push(sc.nextInt());
        }

        deleteMid(st, 0, st.size());

        System.out.println(st);
    }
}