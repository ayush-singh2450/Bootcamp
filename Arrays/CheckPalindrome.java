package Arrays;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();

        int flag = 1;
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                flag = 0;
                break;
            }
        }

        if(flag==1) {
            System.out.print(str + " is a palindrome");
        } else {
            System.out.print(str + " is not a palindrome");
        }

        sc.close();
    }
}
