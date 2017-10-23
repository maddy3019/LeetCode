/**
 * @author Maddy
 * Ver 1.0 Oct 22, 2017 3:07:57 PM
 * Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....
 * Ex:
 * I/P: [3, 5, 2, 1, 6, 4]
 * O/P: [1, 6, 2, 5, 3, 4], [3, 5, 1, 6, 2, 4]
 */

package LeetCode.Google;

public class WiggleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 3, 5, 2, 1, 6, 4 };
		wiggleSort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	/**
	 * @param array
	 */
	private static void wiggleSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 1) {
				if (nums[i - 1] > nums[i]) {
					swap(nums, i);
				}
			} else if (i != 0 && nums[i - 1] < nums[i]) {
				swap(nums, i);
			}
		}
	}

	/**
	 * @param nums
	 * @param i
	 */
	private static void swap(int[] nums, int i) {
		int temp = nums[i];
		nums[i] = nums[i - 1];
		nums[i - 1] = temp;
	}

}
