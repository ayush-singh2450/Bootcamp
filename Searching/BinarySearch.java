package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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

        Arrays.sort(arr);

        System.out.print("Enter string to search: ");
        String key = sc.nextLine();

        int low = 0, high = n - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if(result == 0) {
                System.out.println("String \"" + key + 
                "\" found at position " + (mid + 1));
                sc.close();
                return;
            }
            else if(result > 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("String \"" + key + "\" not found.");

        sc.close();
    }
}