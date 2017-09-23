package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DisappearedNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int len = sc.nextInt();
		System.out.println("Enter array:");
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			final int k = i;
//			System.out.println(i + ":" + Arrays.stream(nums).anyMatch(j -> j == k));
			if (!Arrays.stream(nums).anyMatch(j -> j == k)) {
				res.add(i);
			}
		}
		for (int n : res) {
			System.out.println(n);
		}
	}
}
