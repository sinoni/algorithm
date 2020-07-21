package 완전탐색;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_카펫 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int brown = Integer.parseInt(st.nextToken());
		int yellow = Integer.parseInt(st.nextToken());
		// brown 	yellow		return
		// 10		2			[4, 3]
		// 8		1			[3, 3]	
		// 24		24			[8, 6]
		
		System.out.println(Arrays.toString(solution(brown, yellow)));
		
	}

	private static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int area = brown + yellow;
		
		for(int i=3, size=area/2 ; i<size; ++i) {
			if( area%i == 0 ) {
				int tmp = area/i;
				if( (tmp-2)*(i-2) == yellow ) {
					answer[0]=tmp;
					answer[1]=i;
					break;
				}
			}
		}
        return answer;
	}
}
