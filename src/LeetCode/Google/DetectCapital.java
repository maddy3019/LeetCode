/**
 * @author Maddy
 * Ver 1.0 Sep 26, 2017 12:34:06 AM
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * 1. All letters in this word are capitals, like "USA".
 * 2. All letters in this word are not capitals, like "leetcode".
 * 3. Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Ex 1:
 * Input: "USA"
 * Output: True
 * Ex 2:
 * Input: "FlaG"
 * Output: False
 */

package LeetCode.Google;

public class DetectCapital {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA"));
	}

	/**
	 * @param string
	 * @return true/false
	 */
	private static boolean detectCapitalUse(String word) {
		return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())
				|| (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase()));
	}
}
