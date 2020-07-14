package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_가장큰수 {
	public static void main(String[] args) {
//		int[] numbers = {6, 10, 2};
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(solution(numbers));
	}

	private static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];
		int len = numbers.length;
		
		// String 배열로 변환	
		for(int i=0; i<len; ++i) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		// 정렬	
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		// 0으로만 구성되있을 경우	
		if(arr[0].equals("0")) {
			return "0";
		}
		
		// 결과 출력	
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<len; ++i) {
			sb.append(arr[i]);
		}
		return String.valueOf(sb);
	}
}
