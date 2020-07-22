package programmers;

public class Solution_하샤드수 {
	public static void main(String[] args) {
		int[] input_x = {10, 12, 11, 13};
		for (int x : input_x) {
			System.out.println(solution(x));
		}
	}

	private static boolean solution(int x) {
		String str = String.valueOf(x);
		int sum=0;
		for(int i=0, len = str.length(); i<len; ++i) {
			sum+=str.charAt(i)-'0';
		}
		return x%sum==0;
	}
}
