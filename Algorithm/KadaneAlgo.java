package Algorithm;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int currSum=arr[0],maxSum=arr[0];
        for(int i=1;i<n;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum, maxSum);
            if(currSum<0)
                currSum=0;
        }
        System.out.print(maxSum);
    }
}