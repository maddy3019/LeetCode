/**
 * @author Maddy Ver 1.0 Oct 9, 2017 8:25:51 PM
 * Write a function that, given a string A, B, returns an array C of N integers.
 * For 0 <= j < N, values of C[j] specify the number of strings in A which are strictly smaller
 * than the comparison j-th string in B(starting from 0).
 * Ex:
 * I/P:
 * A = "abcd aabc bd"
 * B = "aaa aa"
 * O/P:
 * [3, 2]
 */

package LeetCode.Google;

import java.util.Arrays;

public class SmallerString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sol = solution("abcd aabc bd", "aaa aa");
		for (int i = 0; i < sol.length; i++) {
			System.out.println(sol[i]);
		}
	}

	/**
	 * @param x
	 * @param y
	 * @return output[]
	 */
	private static int[] solution(String x, String y) {
		String[] xSplit = x.split(" ");
		String[] ySplit = y.split(" ");
		int[] output = new int[ySplit.length];
		for (int i = 0; i < ySplit.length; i++) {
			output[i] = isSmaller(xSplit, ySplit[i]);
		}
		return output;
	}

	/**
	 * @param xSplit
	 * @param ySplit
	 * @return smallStringCount
	 */
	private static int isSmaller(String[] xSplit, String ySplit) {
		int smallStringCount = 0;
		int ySplitFrequency = 0;
		boolean ySplitFreqCounted = false;
		for (int j = 0; j < xSplit.length; j++) {
			char[] ch = (xSplit[j] + ySplit).toCharArray();
			Arrays.sort(ch);
			if (!ySplitFreqCounted) {
				ySplitFrequency = charFrequency(ySplit, ch[0]);
				ySplitFreqCounted = true;
			}
			if (charFrequency(xSplit[j], ch[0]) < ySplitFrequency) {
				smallStringCount++;
			}
		}
		return smallStringCount;
	}

	/**
	 * @param xSplit
	 * @param smallest
	 * @return frequencyCount
	 */
	private static int charFrequency(String xSplit, char smallest) {
		int frequencyCount = 0;
		for (int k = 0; k < xSplit.length(); k++) {
			if (xSplit.charAt(k) == smallest) {
				frequencyCount++;
			}
		}
		return frequencyCount;
	}

}
