package Sorting;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int n = arr.length;
        if (n == 0) return;

        // Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create a count array to store the count of each unique object
        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Change count[i] so that it contains the actual position of this element in output[]
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy the output array to arr, so that arr now contains sorted elements
        System.arraycopy(output, 0, arr, 0, n);
        
        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSorted array:");
        countingSort(arr);
    }
}
