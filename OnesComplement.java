package LeetCode;
import java.util.Scanner;

public class OnesComplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String op = "";
		char[] c = Integer.toBinaryString(num).toCharArray();
		for (int i = 0; i < c.length; i++) {
			op += c[i] == '0' ? '1' : '0';
		}
		System.out.println(Integer.parseInt(op, 2));
	}

}
