package Sorting;

public class BubbleSortOptimized {
    public static void optimizedBubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
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
        optimizedBubbleSort(arr);
    }
}
