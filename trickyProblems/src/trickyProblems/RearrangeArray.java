package trickyProblems;

public class RearrangeArray {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        
        // Traverse each element in the array
        for (int i = 0; i < n; i++) {
            // Process the cycle starting from index `i` if not already rearranged
            while (arr[i] != i) {
                int targetIndex = arr[i]; // Target position for current element
                
                // Swap the values between current position and target position
                int temp = arr[targetIndex];
                arr[targetIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1, 3};
        rearrange(arr);
        
        // Output the rearranged array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}