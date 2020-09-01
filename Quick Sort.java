/*Quick Sort*/

import java.util.Arrays;

public class Random {

    public static void main(String[] args) {
        int arr[] = {5,6,13,9,12,11,10,1,2,4,7,22,13};
        quickSort(arr,0,arr.length - 1);

        System.out.print(Arrays.toString(arr));
    }
    public static int loPartion(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i + 1, high);

        return i + 1;
    }
    public static void quickSort(int arr[],int low, int high){
        if(low < high){
            int pivot = loPartion(arr,low,high);
            quickSort(arr,low,pivot - 1);
            quickSort(arr,pivot + 1,high);
        }
    }
    public static void swap(int arr[],int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

