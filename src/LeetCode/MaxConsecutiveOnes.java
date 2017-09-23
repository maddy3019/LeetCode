package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 1, 0, 1 };
		int max = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
				max = Math.max(count, max);
			} else
				count = 0;
		}
		System.out.println(max);
		// int count = 0;
		// ArrayList<Integer> ls = new ArrayList<Integer>();
		// for (int i = 0; i < nums.length; i++) {
		// if (nums[i] == 1) {
		// count++;
		// } else {
		// ls.add(count);
		// count = 0;
		// }
		// }
		// if (ls.isEmpty()) {
		// ls.add(count);
		// }
		// Collections.sort(ls);
		// System.out.println(ls.get(ls.size() - 1));
	}
}
