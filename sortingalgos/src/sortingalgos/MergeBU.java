package sortingalgos;

public class MergeBU {
    private static Comparable[] auxiliaryArray; // Auxiliary array for merging

    // Function to merge two sorted subarrays
    // array[low..middle] and array[middle+1..high] are merged back into array[low..high]
    private static void merge(Comparable[] array, int low, int middle, int high) {
        int leftPointer = low, rightPointer = middle + 1;

        // Copy the elements from the original array to the auxiliary array
        for (int i = low; i <= high; i++) {
            auxiliaryArray[i] = array[i];
        }

        // Merge the two halves back into the original array
        for (int i = low; i <= high; i++) {
            if (leftPointer > middle) {
                // Left half is exhausted, take from the right half
                array[i] = auxiliaryArray[rightPointer++];
            } else if (rightPointer > high) {
                // Right half is exhausted, take from the left half
                array[i] = auxiliaryArray[leftPointer++];
            } else if (isLess(auxiliaryArray[rightPointer], auxiliaryArray[leftPointer])) {
                // Take from the right half if the element is smaller
                array[i] = auxiliaryArray[rightPointer++];
            } else {
                // Take from the left half
                array[i] = auxiliaryArray[leftPointer++];
            }
        }
    }

    // Function to sort the array using bottom-up merge sort
    public static void sort(Comparable[] array) {
        int arrayLength = array.length;
        auxiliaryArray = new Comparable[arrayLength]; // Initialize the auxiliary array

        // Iterate over subarray sizes: 1, 2, 4, 8, etc.
        for (int subArraySize = 1; subArraySize < arrayLength; subArraySize *= 2) {

            // Merge pairs of subarrays of size subArraySize
            for (int low = 0; low < arrayLength - subArraySize; low += subArraySize * 2) {
                int middle = low + subArraySize - 1;
                int high = Math.min(low + subArraySize * 2 - 1, arrayLength - 1);
                merge(array, low, middle, high);
            }
        }
    }

    // Helper function to compare two Comparable objects
    // Returns true if first < second
    private static boolean isLess(Comparable first, Comparable second) {
        return first.compareTo(second) < 0;
    }

    // Main function to test the bottom-up merge sort
    public static void main(String[] args) {
        String[] testArray = {"Z", "M", "E", "R", "G", "E", "S", "O", "R", "T"};
        sort(testArray);
        System.out.println("Sorted array:");
        for (String element : testArray) {
            System.out.print(element + " ");
        }
    }
}
