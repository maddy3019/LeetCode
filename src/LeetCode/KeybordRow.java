package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KeybordRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		ArrayList<Character> tabRow = new ArrayList<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
		ArrayList<Character> capsRow = new ArrayList<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
		ArrayList<Character> shiftRow = new ArrayList<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
		ArrayList<String> op = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			boolean tab = true, shift = true, caps = true;
			char[] strChar = str[i].toLowerCase().toCharArray();
			System.out.println(Arrays.binarySearch(strChar, 'l'));
			for (int j = 0; j < strChar.length; j++) {
				if (!(tabRow.contains(strChar[j]))) {
					tab = false;
				}
				if (!(capsRow.contains(strChar[j]))) {
					caps = false;
				}
				if (!(shiftRow.contains(strChar[j]))) {
					shift = false;
				}
			}
			if (tab || caps || shift) {
				op.add(str[i]);
			}
		}
		System.out.println(op.toArray(new String[op.size()]));
	}
}
