public class StringPermutation {

    public void swap(char[] arr, int i, int j) {
        char chr = arr[i];
        arr[i] = arr[j];
        arr[j] = chr;
    }

    public void permutation(String str) {
        char[] arr = new char[str.length()];

        for (int i=0; i<arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        permutation(arr, 0);
    }


    public void permutation(char[] arr, int fixed_index) {

        if (fixed_index == arr.length-1){
            System.out.println(arr);
            return;
        }

        for (int i=0; i<arr.length; i++) {
            swap(arr, i, fixed_index);
            permutation(arr, fixed_index+1);
            swap(arr,i, fixed_index);
        }

    }

    public static void main(String[] args) {
        StringPermutation s = new StringPermutation();
        s.permutation("ABC");
    }
}