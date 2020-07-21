package programmers;

public class Solution_약수의합 {
	public static void main(String[] args) {
		int[] n_arr = {12, 5};
		for(int i=0; i<n_arr.length; ++i) {
			System.out.println(solution(n_arr[i]));
		}
	}

	private static int solution(int n) {
		int answer=n;
		for(int i=1; i<=n/2; ++i) {
			if(n%i==0) answer+=i;
		}
		return answer;
	}
}
