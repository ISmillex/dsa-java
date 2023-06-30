package sorting;

import java.util.Arrays;

public class BogoSort {

    // Randomly swap numbers until array is sorted 

    // Time Complexity: 
    //      Worts Case: O(infinity)
    //      Average Case: O(n*n!)
    //      Best Case: O(n


    // Space Complexity: O(1)

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    public static void shuffle(int[] arr) {
        for (int i = 1; i<arr.length; i++) {
            swap(arr, i, (int) (Math.random() * i));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
}