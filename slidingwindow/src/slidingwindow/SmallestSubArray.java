package slidingwindow;

public class SmallestSubArray {
	public static int smallestSubArray(int targetSum,int[] arr) {
		int minWindowSize=Integer.MAX_VALUE;
		int currrentWindowSum=0;
		int windowStart=0;
		for(int windowEnd=0;windowEnd<arr.length;windowEnd++) {
			currrentWindowSum+=arr[windowEnd];
			while(currrentWindowSum>=targetSum) {
				minWindowSize=Math.min(minWindowSize, windowEnd-windowStart+1);
				currrentWindowSum-=arr[windowStart];
				windowStart++;
				
			}
		}
		return minWindowSize;
	}
	
	public static void main(String[] args) {
		int [] input=new int[] {4,2,2,7,8,1,2,8,10};
		int targetSum=8;
		System.out.println(smallestSubArray(targetSum, input));
		
		
	}

}
