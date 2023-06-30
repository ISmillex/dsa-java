package sorting;

import java.util.Arrays;

public class QuickSort {

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low; int j = high;

        while (low < high) {

            do {i++;}
            while(arr[i] > pivot);

            do {j++;}
            while(arr[j] <= pivot);

            if (i<j)
                swap(arr, i, j);
        }
        swap(arr, i, j);
        return j;
    }

    public void sort(int[] arr) {
        sort(arr, 0, arr.length-1);
    }

    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            sort(arr, low, p);
            sort(arr, p+1, high);
        }
    }

    public void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        q.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
