package slidingwindow;

public class Prefixsum {
	 public static void main(String[] args) {
	        int[] A = {6, 3, -2, 4, -1, 0, -5};
	        int n = A.length;
	        
	        // Step 1: Create the prefix sum array
	        int[] prefixSum = new int[n];
	        prefixSum[0] = A[0];
	        
	        for (int i = 1; i < n; i++) {
	            prefixSum[i] = prefixSum[i - 1] + A[i];
	        }
	        
	        // Example: Calculate the sum between range [3, 5]
	        int i = 3; // start index
	        int j = 5; // end index
	        
	        int sumRange = sumBetween(prefixSum, i, j);
	        System.out.println("Sum between range [" + i + ", " + j + "] is: " + sumRange);
	    }
	    
	 public static int sumBetween(int[] prefixSum, int i, int j) {
		 if(i==0) {
			 return prefixSum[j];
		 }
		 else {
			return prefixSum[j]-prefixSum[i-1];
		}
		 
	 }
}
