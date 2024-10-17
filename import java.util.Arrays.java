import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 3, 2, 8, 1, 6};
        int n = 5;

        Arrays.sort(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println(n + "th largest element: " + arr[arr.length - n]);
        System.out.println(n + "th smallest element: " + arr[n - 1]);
    }
}


