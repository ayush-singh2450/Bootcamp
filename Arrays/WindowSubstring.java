package Arrays;
import java.util.Scanner;

public class WindowSubstring{

    public static String minWindow(String s, String t) {

        int[] freq = new int[256];

        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            if (freq[s.charAt(right)] > 0) {
                count--;
            }

            freq[s.charAt(right)]--;

            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    count++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String S: ");
        String s = sc.nextLine();

        System.out.print("Enter String T: ");
        String t = sc.nextLine();

        System.out.println("Minimum Window: " + minWindow(s, t));
    }
}