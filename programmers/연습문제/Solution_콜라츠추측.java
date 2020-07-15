package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_콜라츠추측 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		// N = 		6, 16, 626331
		// answer = 8, 4, 	-1
		
		System.out.println(solution(N));
	}

	private static int solution(int num) {
		int answer = 0;
		while(true) {
			if(num==1) return answer;
			
			if(num%2>0) num=num*3+1;
			else num=num/2;
			
			if(answer++>500) return -1;
		}
	}
}
