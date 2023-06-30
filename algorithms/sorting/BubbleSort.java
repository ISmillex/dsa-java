package sorting;

import java.util.Arrays;

public class BubbleSort {

    // traverse array, compare if current arr[i] is bigger than arr[i+1]
    // if so swap values of i and i+1
    // else no elements to swap, therefore array is already sorted

    // time complexity: O(n^2)
    // space complexity: O(1)

    public void sort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i=0; i<arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arr = new int[] { 64, 34, 25, 12, 22, 11, 90 };
        b.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}