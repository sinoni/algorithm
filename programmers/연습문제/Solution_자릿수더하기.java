package programmers;

public class Solution_자릿수더하기 {
	public static void main(String[] args) {
		int[] input = {123, 987};
		for (int n : input) {
			System.out.println(solution(n));
		}
	}

	private static int solution(int n) {
		int answer=0;
		String str = String.valueOf(n);
		for(int i=0; i<str.length(); ++i) {
			answer += str.charAt(i)-'0';
		}
		return answer;
	}
}
