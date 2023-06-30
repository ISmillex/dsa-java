
import java.util.Arrays;

public class MergeSort {


    // Recursivly divide array by 2 until subarrays length is equal to 1
    // Merge subarrays to sorted array by comparing numbers in leftSubArray to rightSubArray


    // Time Complexity: O(n*logn)
    // Space Complexity: O(n)


    public void merge(int[] arr, int[] leftPart, int[] rightPart, int leftLength, int rightLength) {

        int l = 0; int r = 0; int a = 0;
        while(l < leftLength && r < rightLength) {
            if (leftPart[l] <= rightPart[r]) {
                arr[a] = leftPart[l];
                l++;
            }
            else {
                arr[a] = rightPart[r];
                r++;
            }
            a++;
        }

        while(l < leftLength) {
            arr[a] = leftPart[l];
            l++; a++;
        }

        while(r < rightLength) {
            arr[a] = leftPart[r];
            r++; a++;
        }

    }

    public void sort(int[] arr) {

        if (arr.length == 1)
            return;

        int mid = arr.length/2;

        int leftLength = mid;
        int rightLength = arr.length - mid;

        int[] leftpart = new int[leftLength];
        int[] rightPart = new int[rightLength];

        for (int i=0; i<leftLength; i++) {
            leftpart[i] = arr[i];
        }
        for (int i=0; i<rightLength; i++) {
            rightPart[i] = arr[mid + i];
        }

        sort(leftpart);
        sort(rightPart);

        merge(arr, leftpart, rightPart, leftLength, rightLength);

    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int[] arr = new int[] { 64, 34, 25, 12, 22, 11, 90 };
        m.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
