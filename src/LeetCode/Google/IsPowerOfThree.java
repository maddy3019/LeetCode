/**
 * @author Maddy
 * Ver 1.0 Oct 22, 2017 8:47:29 PM
 * Given an integer, write a function to determine if it is a power of three.
 */

package LeetCode.Google;

public class IsPowerOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 45;
		System.out.println(isPowerOfThree(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static boolean isPowerOfThree(int n) {
		// return isPowerOfThree(n, 3);
		if (n < 1) {
			return false;
		}
		while (n % 3 == 0) {
			n /= 3;
		}
		return n == 1;
	}

	/**
	 * @param n
	 * @param i
	 * @return
	 */
	private static boolean isPowerOfThree(int n, int divisor) {
		if (n == 1) {
			return true;
		} else if (n == 0) {
			return false;
		}
		return isPowerOfThree(n / divisor, divisor);
	}

}
