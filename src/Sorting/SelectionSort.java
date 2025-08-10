package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i=0;i<n-1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j=i+1;j<n;j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nSorted array:");
        selectionSort(arr);
    }
}
