package programmers;

//import java.util.Arrays;

public class Solution_2016년 {
	public static void main(String[] args) {
		int[] input_a = { 5	, 1	, 1	, 2};
		int[] input_b = { 24, 30, 13, 1};
		// 2016년 a월 b일의 요일을 구하는 문제		
		// answer: 		TUE, SAT, WED, MON
		for(int i=0; i<input_a.length; ++i) {
			System.out.println(solution(input_a[i], input_b[i]));
			
		}
	}
	
	static String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
	private static String solution(int a, int b) {
		
		// 1~12월까지 몇일씩 있는지 
		int[] days_in = new int[13];
		for(int i=1; i<13; ++i) {
			if(i==2) days_in[i] = 29;
			else if(i<8) {
				if(i%2>0) days_in[i]=31;
				else days_in[i]=30;
			}else {
				if(i%2>0) days_in[i]=30;
				else days_in[i] = 31;
			}
		}
//		System.out.println(Arrays.toString(days_in));
		
		// 날짜 계산	
		int days=b;
		for(int i=1; i<a; ++i) {
			days+=days_in[i];
		}
		
		return day[days%7];
	}

}
