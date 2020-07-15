package programmers;

import java.util.Arrays;

public class Solution_주식가격 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices)));
	}
	
	private static int[] solution(int[] prices) {
		int len = prices.length;
		int[] answer = new int[len];
		for(int i=0; i<len-1; ++i) {
			for(int j=i+1; j<len; ++j) {
				if(prices[i]>prices[j]) {
					answer[i] = j-i;
					break;
				}
				if(j==len-1) answer[i] = j-i;
			}
		}
		
        return answer;
	}
}
