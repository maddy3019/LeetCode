/**
 * Class to add digits.
 * @author Maddy
 * Ver 1.0 09/05/2017
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 */

package LeetCode;

public class AddDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(addDigits(101));
	}

	/**
	 * @param num
	 */
	static int addDigits(int num) {
		int sum = 0;
		while ((num >= 10) || (num % 10 != 0)) {
			sum += num % 10;
			num /= 10;
			if (0 == num && sum >= 10) {
				num = sum;
				sum = 0;
			}
		}
		return sum;
	}
}
