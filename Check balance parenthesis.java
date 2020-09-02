/*Check balance parenthesis*/

import java.util.Stack;

public class Random {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /*for (int i = 0; i < 15; i++)
            stack.push(i);

        System.out.println(stack.size());
        System.out.println(stack.peek());

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
         */

        String str = "([]))";
        System.out.println(checkParenthesis(str));
    }

    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
                stack.push(str.charAt(i));
            else if (stack.isEmpty())
                return false;
            else if (!checkChar(stack.peek(), str.charAt(i)))
                return false;
            else
                stack.pop();
        }
        return stack.isEmpty();
    }

    public static boolean checkChar(char a, char b) {
        return a == '(' && b == ')' ||
                a == '{' && b == '}' ||
                a == '[' && b == ']';
    }

}

