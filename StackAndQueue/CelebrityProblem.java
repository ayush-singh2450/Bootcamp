package StackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class CelebrityProblem {

    static int findCelebrity(int[][] arr, int n) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (arr[a][b] == 1) {
                st.push(b); 
            } else {
                st.push(a);
            }
        }

        int celebrity = st.pop();

  
        for (int i = 0; i < n; i++) {

            if(i != celebrity){
                if (arr[celebrity][i] == 1 || arr[i][celebrity] == 0) {
                    return -1;
                }
            }
        }

        return celebrity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = findCelebrity(arr, n);

        if (result == -1)
            System.out.println("No Celebrity Found");
        else
            System.out.println("Celebrity is Person " + result);

        sc.close();
    }
}