package Arrays;

import java.util.Scanner;

/**
 * RotateArray
 */
public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int target=sc.nextInt();
        int flag=0;
        int index=-1;
        for(int i=0;i<n;i++){
            if(target==arr[i]){
                index=i;
                 flag=1;
                break;
            }
        }
            if (index != -1) {
            for (int i = index; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Target not found");
        }
    }
}
        
    