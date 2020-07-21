package programmers;

public class Solution_가운데글자가져오기 {
	public static void main(String[] args) {
		String[] input = {"abcde", "qwer"};
		for (String s : input) {
			System.out.println(solution(s));
		}
	}
	private static int len, half;
	private static String answer;
	private static String solution(String s) {
		len = s.length();
		half = len/2;
		
		if(len%2>0) answer = String.valueOf(s.charAt(half));
		else 		answer = s.substring(half-1, half+1);
		
		return answer;
	}
}
