package Arrays;

import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {

        String result = "";

        for (int i = 0; i < arr[0].length(); i++) {

            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) {
                    return result;
                }
            }

            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Longest Common Prefix: " +
                           longestCommonPrefix(arr));
    }
}