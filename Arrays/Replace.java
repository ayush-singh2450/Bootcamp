package Arrays;
import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String pattern=sc.nextLine();
        String value=sc.nextLine();

        String str2 = str1.replace(pattern,value);
        System.out.println(str2);
        sc.close();
    }
}
