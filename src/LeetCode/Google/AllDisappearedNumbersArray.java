/**
 * @author Maddy
 * Ver 1.0 Sep 26, 2017 12:28:22 AM
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * Ex 1:
 * Input:	[4,3,2,7,8,2,3,1]
 * Output:	[5,6]
 */

package LeetCode.Google;

import java.util.ArrayList;
import java.util.List;

public class AllDisappearedNumbersArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
		for (Integer item : findDisappearedNumbers(nums)) {
			System.out.println(item);
		}
	}

	/**
	 * @param nums
	 * @return List<Integer> res
	 */
	private static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < nums.length; i++)
			nums[(nums[i] - 1) % n] += n;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] <= n)
				res.add(i + 1);
		return res;
	}
}
