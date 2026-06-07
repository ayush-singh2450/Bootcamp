package StackAndQueue;
import java.util.*;
public class PostfixEvaluation {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        Stack<Integer> st = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isDigit(ch))
                st.push(ch - '0');

            else {
                int b = st.pop();
                int a = st.pop();

                switch(ch) {
                    case '+': st.push(a+b); break;
                    case '-': st.push(a-b); break;
                    case '*': st.push(a*b); break;
                    case '/': st.push(a/b); break;
                }
            }
        }

        System.out.println(st.pop());
    }
}

