
package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_타일장식물 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		System.out.println(solution(N));
	}
	private static long solution(int N) {
		return fibonacci(N,2,4);
	}

	private static long fibonacci(int count, long before, long current) {
		if(count==1) return current;
		
		return fibonacci(--count, current, before+current);
	}
}
