package Arrays;
import java.util.Scanner;
public class ValidParanthesis {

    public static boolean isValid(String str) {
        String stack = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if (ch == '(' || ch == '{' || ch == '[') {
                stack += ch;
            }
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.length() == 0)
                    return false;

                char top = stack.charAt(stack.length() - 1);

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {

                    
                    stack = stack.substring(0, stack.length() - 1);
                } else {
                    return false;
                }
            }
        }

        return stack.length() == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String str = sc.nextLine();

        if (isValid(str))
            System.out.println("Valid Parentheses");
        else
            System.out.println("Invalid Parentheses");
    }
}

