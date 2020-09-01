/*Chocolate distribution problem*/

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int no_of_student = 5;

        System.out.print(chocolateDist(arr, arr.length, no_of_student));
    }

    public static int chocolateDist(int[] arr, int n, int no_of_student) {
        int result = 0;
        Arrays.sort(arr);
        result = arr[no_of_student - 1] - arr[0];
        for (int i = 1; (i + no_of_student - 1) < n; i++) {
            result = Math.min(result, arr[i + no_of_student - 1] - arr[i]);
        }
        return result;
    }
}

