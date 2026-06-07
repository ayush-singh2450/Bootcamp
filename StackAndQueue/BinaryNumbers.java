package StackAndQueue;

import java.util.*;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();

        q.add("1");

        for(int i = 1; i <= n; i++) {
            String curr = q.remove();

            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
}
