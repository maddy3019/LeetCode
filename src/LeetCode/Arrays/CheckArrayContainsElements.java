package LeetCode.Arrays;

import java.util.Arrays;

public class CheckArrayContainsElements {

	public static void main(String[] args) {
		int[] arrA = { 11, 17, 13, 19, 15, 16, 12, 14 };
		System.out.println(checkRangeInArray(arrA, 12, 18));
	}

	private static boolean checkRangeInArray(int[] arrA, int x, int y) {
		int[] range = new int[y - x + 1];
		int j = 0;
		for (int k = 0; k < arrA.length; k++) {
			if (arrA[k] >= x && arrA[k] <= y) {
				range[j] = arrA[k];
				j++;
			}
		}
		Arrays.sort(range);
		int l = 0;
		for (int i = x; i <= y; i++) {
			if (!(range[l] == i)) {
				return false;
			}
			l++;
		}
		return true;
	}
}
