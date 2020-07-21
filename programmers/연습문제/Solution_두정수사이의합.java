package programmers;

public class Solution_두정수사이의합 {
	public static void main(String[] args) {
		int[] input_a = {3, 3, 5};
		int[] input_b = {5, 3, 3};
		for(int i=0; i<input_a.length; ++i) {
			System.out.println(solution(input_a[i], input_b[i]));
		}
	}

	private static long solution(int a, int b) {
		return sum( Math.min(a, b), Math.max(a, b)  );
	}

	private static long sum(long min, long max) {
		return (min+max) * (max-min+1) / 2 ;
	}
}
