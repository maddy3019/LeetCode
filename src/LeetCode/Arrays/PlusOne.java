/**
 * @author Maddy
 * Ver 1.0 Sep 22, 2017 7:55:11 PM
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * Ex 1:
 * I/P: digits = [1, 2, 3] + 1
 * O/P: digits = [1, 2, 4]
 * Ex 2:
 * I/P: digits = [9] + 1
 * O/P: digits = [1, 0]
 */

package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] digits = new int[] { 1, 2, 3 };
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	/**
	 * @param digits
	 * @return digits
	 */
	private static int[] plusOne(int[] digits) {
		// Carry is the 'plusOne'
		int carry = 1;

		// a list of Integer 'out' to store digits after 'plusOne'
		List<Integer> out = new ArrayList<Integer>();

		// traverse through array from the tail and adjust carry
		// base = 10
		// nextDigit method is used to avoid ArrayIndexOutOfBounds exception which is
		// very likely to occur
		int i = digits.length - 1;
		while (i >= 0 || carry > 0) {
			int sum = nextDigit(digits, i) + carry;
			out.add(sum % 10);
			carry = sum / 10;
			i--;
		}

		// declare a result array of size of list 'out' and add each element of 'out' to
		// it
		int[] outArray = new int[out.size()];
		int index = out.size() - 1;
		for (Integer j : out) {
			outArray[index--] = j;
		}

		return outArray;
	}

	/**
	 * @param digits
	 * @param i
	 * @return i
	 */
	private static int nextDigit(int[] digits, int i) {
		return (i >= 0) ? digits[i] : 0;
	}

}
