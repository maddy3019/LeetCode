/**
 * Class to determine whether an integer is a palindrome. Do this without extra space.
 * @author Maddy
 * Ver 1.0 09/04/2017
 */

package LeetCode;

public class NumberPalindrome {
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		else {
			int temp = x;
			int sum = 0;
			while (x > 0) {
				sum = (sum * 10) + (x % 10);
				x = x / 10;
			}
			if (temp == sum)
				return true;
			else
				return false;
		}
	}
}
