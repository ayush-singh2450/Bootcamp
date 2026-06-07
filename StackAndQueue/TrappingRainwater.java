package StackAndQueue;

import java.util.Scanner;

public class TrappingRainwater {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Eneter size:");
    int n =sc.nextInt();
     int height[]=new int[n];
     System.out.print("Eneter elements:");
     for(int i=0;i<n;i++){
        height[i]=sc.nextInt();
     }
    int lmax[]=new int[n];
    int rmax[]=new int[n];
lmax[0]=height[0];
rmax[n-1]=height[n-1];
    for (int i = 1; i < n; i++) {
        lmax[i] =Math.max(lmax[i-1],height[i]);    
    }
     for (int i = n-2; i >=0; i--) {
        rmax[i] =Math.max(rmax[i+1],height[i]);    
    }
    int ans=0;
    for(int i=0;i<n;i++){
        ans+=(Math.min(lmax[i],rmax[i])-height[i]);
    }
    System.out.print(ans);
    }

}
