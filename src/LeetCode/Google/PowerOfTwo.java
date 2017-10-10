/**
 * @author Maddy
 * Ver 1.0 Sep 30, 2017 4:48:42 PM
 * Power of Two: Given an integer, write a function to determine if it is a power of two.
 */

package LeetCode.Google;

public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(64));
	}

	/**
	 * @param i
	 * @return true/false
	 */
	private static boolean isPowerOfTwo(int n) {
		 return n > 0 && Integer.bitCount(n) == 1;
		// System.out.println(((~n)));
		// return n>0 && ((~n) & 1) == n;
	}

}
