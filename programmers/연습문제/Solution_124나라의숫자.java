package programmers;

public class Solution_124나라의숫자 {
	public static void main(String[] args) {
		int[] input_n = {1, 2, 3, 4,  5,  6,  7,  8,  9,  10, 11, 12, 13,  14,  15,  16,  17,  18,  19, 20};
		// 	  return  =  1, 2, 4, 11, 12, 14, 21, 22, 24, 41, 42, 44, 111, 112, 114, 121, 122, 124, 141, 142
		for (int n : input_n) {
			System.out.println(n+"->"+solution(n));
		}
	}

	private static String[] arr = {"4", "1", "2"};
	private static String solution(int n) {
		StringBuilder sb = new StringBuilder();
		while(n>0) {
			int rest = n%3;
			sb.insert(0, arr[rest]);
			if(rest==0) n--;
			n/=3;
		}
		return sb.toString();
	}

}
