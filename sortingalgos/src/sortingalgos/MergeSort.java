package sortingalgos;

public class MergeSort {

    // Main mergeSort function: recursively divides the array into halves
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2; // Find the middle point to split the array

            // Recursively sort each half
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    // Helper function to merge two sorted halves
    public static void merge(int[] array, int left, int middle, int right) {
        int leftSize = middle - left + 1; // Size of left half
        int rightSize = right - middle;   // Size of right half

        // Create temporary arrays for left and right halves
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy data to temporary arrays
        for (int i = 0; i < leftSize; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < rightSize; i++)
            rightArray[i] = array[middle + 1 + i];

        // Initial indexes for merging
        int i = 0, j = 0;
        int k = left; // Initial index of the merged array

        // Merge the temporary arrays back into the main array
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of leftArray
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy any remaining elements of rightArray
        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int value : array)
            System.out.print(value + " ");
        System.out.println();
    }

    // Main function to test the merge sort algorithm
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
