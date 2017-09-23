/**
 * Class to calculate Two Sum.
 * @author Maddy
 * Ver 1.0 09/02/2017
 * {Given nums = [2, 7, 11, 15], target = 9
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].}
 */

package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] twoSum = calculateSum(new int[] { 3, 2, 4 }, 6);
		System.out.println("[" + twoSum[0] + ", " + twoSum[1] + "]");
	}

	private static int[] calculateSum(int[] nums, int target) {
		// O(n^2) solution
		// for (int i = 0; i < nums.length; i++) {
		// for (int j = i + 1; j < nums.length; j++) {
		// if (i != j) {
		// if ((nums[i] + nums[j]) == target) {
		// return new int[] { i, j };
		// }
		// }
		// }
		// }
		// return new int[] { 0, 0 };
		
		//O(n) solution
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { 0, 0 };
	}

}
