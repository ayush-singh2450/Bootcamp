package Problems;
import java.util.Scanner;
public class SwapKElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int i = 0; i + k - 1 < n; i += k) {
            int left = i;
            int right = i + k - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
