package programmers;

import java.util.Arrays;

public class Solution_k번째수 {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = { {2, 5, 3}, {4, 4, 1}, {1, 7, 3} };
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	
	static int start, end, num;
	private static int[] solution(int[] array, int[][] commands) {
		int len = commands.length;
		int[] ans = new int[len];
		for(int i=0; i<len; ++i) {
			start = commands[i][0]-1;
			end = commands[i][1];
			num = commands[i][2]-1;
			
			int[] temp = Arrays.copyOfRange(array, start, end);
			Arrays.sort(temp);
			ans[i] = temp[num];
		}
        return ans;
	}
}
