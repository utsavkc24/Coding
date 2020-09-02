/*Next Greatest element*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Random {

    public static void main(String[] args) {
        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        int[] arr2 = {10, 15, 20, 25};
        int[] arr3 = {25, 20, 15, 10};
        leftGreatest(arr);
        System.out.println();
        leftGreatest(arr2);
        System.out.println();
        leftGreatest(arr3);
    }

    public static void leftGreatest(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        stack.push(arr[0]);
        list.add(-1);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > stack.peek()) {
                while (!stack.isEmpty() && arr[i] > stack.peek()) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    list.add(-1);
                } else
                    list.add(stack.peek());

            } else {
                list.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.print(list);
    }
}

