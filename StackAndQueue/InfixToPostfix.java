package StackAndQueue;
import java.util.*;
public class InfixToPostfix {
    
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/' || ch == '^') return 2;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infix = sc.nextLine();
        String postfix = "";

        Stack<Character> st = new Stack<>();

        for (char ch : infix.toCharArray()) {

            if (Character.isLetterOrDigit(ch))
                postfix += ch;

            else {
                while (!st.isEmpty() &&
                       precedence(st.peek()) >= precedence(ch))
                    postfix += st.pop();

                st.push(ch);
            }
        }

        while (!st.isEmpty())
            postfix += st.pop();

        System.out.println(postfix);
    }
}

