//package slidingwindow;
//
//public class MaxSumSubarray {
//    public static int findMaxSumSubarray(int[] arr, int k) {
//        int maxValue = Integer.MIN_VALUE;
//        int currentRunningSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            currentRunningSum += arr[i];
//            if (i >= k - 1) {
//                maxValue = Math.max(maxValue, currentRunningSum);
//                currentRunningSum -= arr[i - (k - 1)];
//            }
//        }
//        return maxValue;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(findMaxSumSubarray(new int[]{4, 2, 1, 3, 6, 7, 8, 1, 2}, 3));
//    }
//}
package slidingwindow;

import java.util.Arrays;

public class MaxSumSubarray {
    static class Result {
        int maxSum;
        int[] subarray;

        Result(int maxSum, int[] subarray) {
            this.maxSum = maxSum;
            this.subarray = subarray;
        }
    }

    public static Result findMaxSumSubarray(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;
        int startIndex = 0;
        int[] maxSubarray = new int[k];

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];
            if (i >= k - 1) {
                if (currentRunningSum > maxValue) {
                    maxValue = currentRunningSum;
                    startIndex = i - (k - 1);
                    System.arraycopy(arr, startIndex, maxSubarray, 0, k);
                }
                currentRunningSum -= arr[i - (k - 1)];
            }
        }

        return new Result(maxValue, maxSubarray);
    }

    public static void main(String[] args) {
        Result result = findMaxSumSubarray(new int[]{4, 2, 1, 3, 6, 7, 8, 1, 2}, 3);
        System.out.println("Max Sum: " + result.maxSum);
        System.out.println("Subarray: " + Arrays.toString(result.subarray));
    }
}
