package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Solution_문자열내림차순으로배치하기 {
	public static void main(String[] args) {
		String s = "Zbcdefg";
		// answer = gfedcbZ					// solution0
		System.out.println("solution0: " + solution0(s));
		System.out.println("solution1: " + solution1(s));
	}

	private static String solution0(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		StringBuilder sb = new StringBuilder();
		String answer = sb.append(ch).reverse().toString();
		return answer;
	}
	
	private static String solution1(String s) {
		String str[] = s.split("");
		Arrays.sort(str, Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (String string : str) {
			sb.append(string);
		}
		return sb.toString();
	}
	
}
