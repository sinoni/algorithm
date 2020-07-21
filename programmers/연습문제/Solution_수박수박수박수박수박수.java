package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_수박수박수박수박수박수 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		System.out.println(solution(n));
		// input : n = 3 ,	n = 4
		// answer: 수박수  ,	수박수박		
	}

	private static String solution(int n) {
		StringBuilder subak = new StringBuilder();
		for(int i=0, half=n/2; i<half; ++i) {
			subak.append("수박");
		}
		if(n%2>0) subak.append("수");
		
		return subak.toString();
	}
}
