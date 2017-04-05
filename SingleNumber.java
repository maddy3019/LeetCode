package LeetCode;

import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int len = sc.nextInt();
		System.out.println("Enter array:");
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		int res = 0;
		for (int i = 1; i < nums.length; i++) {
			res ^= nums[i];
		}
		System.out.println(res);
	}
}
