package Sorting;
import java.util.*;

public class CountInversion {

    static int count = 0;

    static void mergeSort(int arr[], int l, int r) {

        if(l < r) {

            int mid = (l+r)/2;

            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);

            merge(arr,l,mid,r);
        }
    }


    static void merge(int arr[], int l, int mid, int r) {

        int n1 = mid-l+1;
        int n2 = r-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];


        for(int i=0;i<n1;i++)
            L[i]=arr[l+i];

        for(int i=0;i<n2;i++)
            R[i]=arr[mid+1+i];


        int i=0,j=0,k=l;


        while(i<n1 && j<n2) {

            if(L[i] <= R[j]) {
                arr[k++]=L[i++];
            }
            else {
                arr[k++]=R[j++];
                count += (n1-i);
            }
        }


        while(i<n1)
            arr[k++]=L[i++];

        while(j<n2)
            arr[k++]=R[j++];
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();


        mergeSort(arr,0,n-1);

        System.out.println("Number of inversions: "+count);
    }
}