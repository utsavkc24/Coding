/*Insertion sort*/
import java.util.*;
 public class Random {
     public static void main(String[] args) {
         int arr[] = {16, 17, 4, 3, 5, 2};
         int n = arr.length;
         for(int i = 1; i < n; i++){
             int key = arr[i];
             int j = i - 1;

             while(j >=0 && arr[j] > key){
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = key;
         }

         System.out.print(Arrays.toString(arr));
     }

}

