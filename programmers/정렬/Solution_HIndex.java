package programmers;

import java.util.Arrays;

public class Solution_HIndex {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution(citations));
	}
	
	static int h, k;
	private static int solution(int[] citations) {
		Arrays.sort(citations);
		for(int i=0, len = citations.length; i<len; ++i) {
			h = citations[i];
			k = len - i;
			
			if(h>=k) {
				return k;
			}
		}
		return 0;
		
	}

}
