package programmers;

public class Solution_문자열다루기기본 {
	public static void main(String[] args) {
		String[] input = {"a234", "1234", "01233456789"};
		for (String s : input) {
			System.out.println(solution(s));
		}
	}

	private static boolean solution(String s) {
		int len = s.length();
		if(len!=4 && len!=6) return false;
		for(int i=0; i<s.length(); ++i) {
			int tmp = s.charAt(i)-'0';
			if(tmp>9 || tmp<0) return false;
		}
        return true;
	}
}
