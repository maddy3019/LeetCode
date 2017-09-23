/**
 * Class to calculate max sum of array partition.
 * @author Maddy
 * Ver 1.0 00/00/201
 * Input: [1,4,3,2]
   Output: 4
   Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 */

package LeetCode.Arrays;

import java.util.Arrays;

public class ArrayPartitionI {
	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int[] { 1, 2, 4, 3 }));
	}

	static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0)
				sum += nums[i];
		}
		return sum;
	}
}
