/**
 * @author Maddy
 * Ver 1.0 Sep 22, 2017 8:07:51 PM
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * 1. The length of both num1 and num2 is < 5100.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * Ex 1:
 * I/P: num1 = "12", num2 = "23"
 * O/P: "35"
 */

package LeetCode.Google;

public class AddStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(addStrings("12","23"));
	}

	/**
	 * @param num1
	 * @param num2
	 * @return (num1 + num2)
	 */
	private static String addStrings(String num1, String num2) {
		
		// append zeros at the start of the smaller string to make both strings equal in length 
		int appendZeros = (num1.length() > num2.length()) ? (num1.length() - num2.length()) : (num2.length() - num1.length());
        for(int i = 0; i < appendZeros; i++) {
            if(num1.length() < num2.length()) {
                num1 = "0" + num1;
            }
            else {
                num2 = "0" + num2;
            }
        }
        
        // convert both strings to character arrays
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        
        // store the lengths of character arrays
        int i = a.length - 1;
        int j = b.length - 1;
        
        // initialize carry to 0
        String sum = "";
        int carry = 0;
        
        // handling edge cases
        if(i == 0 && String.valueOf(a[i]).equals("0")) {
            return num2;
        }
        if(j == 0 && String.valueOf(b[j]).equals("0")) {
            return num1;
        }
        
        // performing addition
        while(true) {
            int k = Integer.parseInt(Character.toString(a[i])) + Integer.parseInt(Character.toString(b[j])) + carry;
            if(k > 9) {
                carry = 1;
                k = k - 10;
            }
            else
                carry = 0;
            sum += String.valueOf(k);
            i--; j--;
            if(i < 0 || j < 0) {
                if( carry != 0) {
                    sum += String.valueOf(carry);
                }
                break;
            }
        }
        return new StringBuilder(sum).reverse().toString();
	}

}
