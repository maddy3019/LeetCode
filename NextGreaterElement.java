package LeetCode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] num1 = { 4, 1, 2 };
		int[] num2 = { 1, 3, 4, 2 };
		System.out.println(nextGreaterElement(num1, num2)[0] + "," + nextGreaterElement(num1, num2)[1] + ","
				+ nextGreaterElement(num1, num2)[2]);

	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] op = new int[nums1.length];
		Integer[] temp = new Integer[nums2.length];
		int counter = 0;
		for (int k : nums2) {
			temp[counter] = k;
			counter++;
		}
		List<Integer> num2List = Arrays.asList(temp);
		for (int i = 0; i < nums1.length; i++) {
			op[i] = -1;
			for (int j = num2List.indexOf(nums1[i]) + 1; j < nums2.length; j++) {
				if (nums2[j] > nums1[i]) {
					op[i] = nums2[j];
					break;
				}
			}
		}
		return op;
	}

}
