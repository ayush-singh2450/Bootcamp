package Arrays;

import java.util.Scanner;

public class StringPermutation {
    public static void permute(char[] arr,int index){
        if(index==arr.length){
            System.out.println(arr);
            return;
        }
        for(int i=index;i<arr.length;i++){
            char temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

            permute(arr,index+1);
            temp = arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        permute(str.toCharArray(),0);
    }
    
}
