

import java.util.Arrays;

public class InsertionSort {

    // traverse arr and swap untill arr[j] is equall or smaller than arr[j+1]

    public void sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int[] arr = new int[] { 64, 34, 25, 12, 22, 11, 90 };
        i.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
