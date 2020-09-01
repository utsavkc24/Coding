/*Segregate 0's,1's and 2 in an array*/

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 0, 2, 2, 2, 2, 1, 0, 2, 1};
        segregate(arr, arr.length);

        System.out.print(Arrays.toString(arr));
    }

    public static void segregate(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, high);
                    high--;
                    mid++;
            }
        }

    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

