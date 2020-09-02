/*Stock Span problem*/

import java.util.Stack;

public class Random {

    public static void main(String[] args) {
        int[] arr = {15, 13, 12, 14, 16, 8, 6, 4, 10, 30};
        stockSpan(arr);
    }

    public static void stockSpan(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.print(1 + " ");

        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            int span = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            System.out.print(span + " ");
            stack.push(i);
        }
    }
}

