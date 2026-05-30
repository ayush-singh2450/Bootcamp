 package Arrays;
 import java.util.Scanner;
public class ConcatAndReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String id = sc.nextLine();

        int i = 0;
        while (i < name.length() && name.charAt(i) == ' ')
            i++;

        String first = "";
        while (i < name.length() && name.charAt(i) != ' ') {
            first += name.charAt(i);
            i++;
        }

        // Find last word
        int j = name.length() - 1;
        while (j >= 0 && name.charAt(j) == ' ')
            j--;

        String last = "";
        while (j >= 0 && name.charAt(j) != ' ') {
            last = name.charAt(j) + last;
            j--;
        }

        System.out.print(first + "_" + last + id);

        sc.close();
    }
}
