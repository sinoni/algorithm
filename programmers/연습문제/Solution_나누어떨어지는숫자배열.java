package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		ArrayList<int[]> input_list = new ArrayList<>();
		input_list.add(new int[] {5, 9, 7, 10});
		input_list.add(new int[] {2, 36, 1, 3});
		input_list.add(new int[] {3, 2, 6});
		
		int[] input_divisor = {5, 1, 10};
		
		// 방법 1		
		System.out.println("방법1: solution1 ");
		for(int i=0; i<input_list.size(); ++i) {
			System.out.println( Arrays.toString( solution1(input_list.get(i), input_divisor[i]) ) );
		}
		// 방법 2		
		System.out.println("\n방법2: solution2 ");
		for(int i=0; i<input_list.size(); ++i) {
			System.out.println( Arrays.toString( solution2(input_list.get(i), input_divisor[i]) ) );
		}
		
		/** 참고: 효율성 측면에서 방법1이 방법2보다 시간 적게 소모	 */
	}

	private static int[] solution1(int[] arr, int divisor) {
		int[] answer;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; ++i) {
			if(arr[i]%divisor==0) list.add(arr[i]);
		}
		
		if(list.size()<1) list.add(-1);
		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); ++i) {
			answer[i]=list.get(i);
		}
		Arrays.sort(answer);
		
		return answer;
	}

	private static int[] solution2(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr.length; ++i) {
			if(arr[i]%divisor==0) list.add(arr[i]);
		}
		if(list.size()<1) list.add(-1);
		
		int[] answer = list.stream().mapToInt(x->x).toArray();
		Arrays.sort(answer);
		return answer;
	}
}
