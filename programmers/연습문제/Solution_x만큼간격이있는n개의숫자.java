package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_x만큼간격이있는n개의숫자 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		// input :	x	n		//	result
		//			2	5			[2, 4, 6, 8, 10]		
		//			4	3			[4, 8, 12]
		//		   -4	2			[-4, -8]
		
		System.out.println(Arrays.toString(solution(x, n)));
	}

	private static long[] solution(int x, int n) {
		long[] arr = new long[n];
		
		arr[0] = x;
		for(int i=1; i<n; ++i) {
			arr[i] = arr[i-1]+x;
		}
		
		return arr;
	}
}
