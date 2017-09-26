/**
 * @author Maddy
 * Ver 1.0 Sep 26, 2017 12:19:29 AM
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * Ex 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * 				The maximum number of consecutive 1s is 3. 
 */

package LeetCode.Google;

public class MaxConsecutiveOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	/**
	 * @param object
	 */
	private static int findMaxConsecutiveOnes(int[] nums) {
		int max = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				max = Math.max(count, max);
			} else
				count = 0;
		}
		return max;
	}
}
