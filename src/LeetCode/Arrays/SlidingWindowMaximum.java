/**
 * @author Maddy
 * Ver 1.0 Mar 8, 2018 9:44:30 AM
 * Class: Sliding window maximum
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window.
 * Each time the sliding window moves right by one position.
 * For example:
 * I/P:
 * nums = [1,3,-1,-3,5,3,6,7]
 * k = 3.
 * O/P:
 * [3,3,5,5,6,7]
 */

package LeetCode.Arrays;

public class SlidingWindowMaximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i:maxSlidingWindow(new int[] {},3)) {
			System.out.println(i);
		}

	}

	/**
	 * @param nums
	 * @param k
	 * @return
	 */
	private static int[] maxSlidingWindow(int[] nums, int k) {
		int median = Integer.MIN_VALUE;
        int len = nums.length;
        int[] medianArray;
        if(len == 0) { medianArray = new int[0]; }
        else
        {
            medianArray = new int[nums.length - k + 1];
            int start = 0;
            int end = k;
            for(int i = 0; i < len - k + 1; i++)
            {
                while(start < end) { median = Math.max(median, nums[start++]); }
                start = i + 1;
                end += 1; 
                medianArray[i] = median;
                median = Integer.MIN_VALUE;
            }
        }
        return medianArray;
	}

}
