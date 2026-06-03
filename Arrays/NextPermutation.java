package Arrays;
import java.util.Scanner;

public class Main {

    static void nextPermutation(char[] arr) {
        int i = arr.length - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = arr.length - 1;

         
            while (arr[j] <= arr[i]) {
                j--;
            }

         
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    
        int left = i + 1;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print("Next Permutation: ");
        System.out.println(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        nextPermutation(str.toCharArray());
    }
}