package hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SubarraySumEqualsK {
	public int subarraySum(int[] nums,int k) {
		int count=0,sum=0;
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		map.put(0, 1);
		for (int num:nums) {
			sum +=num;
			if(map.containsKey(sum-k)) {
				count+=map.get(sum-k);
				
			}
			map.put(sum, map.getOrDefault(sum, 0)+1);
			
		}
		return count;
	}
	   public static void main(String[] args) {
	        SubarraySumEqualsK solution = new SubarraySumEqualsK();
	        int[] nums = {1, 1, 1};
	        int k = 2;
	        System.out.println("Number of subarrays: " + solution.subarraySum(nums, k));  // Output: 2
	    }

}