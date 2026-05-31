package Arrays;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] LastIndex = new int[256];
        for(int i=0;i<256;i++){
            LastIndex[i]=-1;
        }
        int maxLength=0;
        int start=0;
        for(int end=0;end<str.length();end++){
            char ch = str.charAt(end);
            if(LastIndex[ch]>=start)
                start = LastIndex[ch]+1;
            LastIndex[ch]=end;
            int curLength = end - start +1;
            if(curLength>maxLength)
                maxLength=curLength;
        }
        System.out.println(maxLength);
    }
}
