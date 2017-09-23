/**
 * Class to add two integers without arithmetic operators.
 * @author Maddy
 * Ver 1.0 09/06/2017
 * 
 */

package LeetCode;

public class SumOfTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getSum(20, 30));
	}

	/**
	 * @param a,b
	 * 
	 */
	static int getSum(int a, int b) {
		while (b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

}
