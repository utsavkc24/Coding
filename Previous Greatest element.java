/*Previous Greatest element*/

import java.util.Stack;

public class Random {

    public static void main(String[] args) {
        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        int[] arr2 = {8, 10, 12};
        int[] arr3 = {12, 10, 8};
        leftGreatest(arr);
        System.out.println();
        leftGreatest(arr2);
        System.out.println();
        leftGreatest(arr3);
    }

    public static void leftGreatest(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        System.out.print(-1 + " ");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > stack.peek()) {
                while (!stack.isEmpty() && arr[i] > stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    System.out.print(-1 + " ");
                } else
                    System.out.print(stack.peek() + " ");

                stack.push(arr[i]);
            } else {
                System.out.print(stack.peek() + " ");
                stack.push(arr[i]);
            }
        }
    }
}

