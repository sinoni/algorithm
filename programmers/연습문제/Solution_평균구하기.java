package programmers;

import java.util.ArrayList;

public class Solution_평균구하기 {
	public static void main(String[] args) {
		ArrayList<int[]> input_list = new ArrayList<int[]>();
		input_list.add(new int[] {1, 2, 3, 4});
		input_list.add(new int[] {5, 5});
		for (int[] arr : input_list) {
			System.out.println(solution(arr));
		}
	}

	private static double solution(int[] arr) {
		int sum=0;
		for (int i : arr) sum+=i;
		return (double) sum/arr.length;
	}
}
