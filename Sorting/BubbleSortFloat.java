package Sorting;
import java.util.Scanner;

public class BubbleSortFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of float values: ");
        int n = sc.nextInt();

        float[] arr = new float[n];

        System.out.println("Enter float values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("\nSorted Float Values:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", arr[i]);
        }

        // Minimum and Maximum values
        float min = arr[0];
        float max = arr[n - 1];

        System.out.printf("\n\nMinimum Value: %.2f", min);
        System.out.printf("\nMaximum Value: %.2f", max);

        sc.close();
    }
} 
