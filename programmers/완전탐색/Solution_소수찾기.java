package 완전탐색;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution_소수찾기 {
	public static void main(String[] args) {
//		String numbers = "17";
		String numbers = "011";
		System.out.println(solution(numbers));
	}
	
	private static int tmp, answer=0;
	private static int[] countInputNum = new int[10];
	private static boolean flag;
	private static boolean[] checkPrime;
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	private static int solution(String str_numbers) {
		// 최대값 구하기		
		int maxNum = makeMaxNum(str_numbers);
		
		// 최대값 이하의 소수 찾기	
		findPrimeNum(maxNum);
		
		// 가능한 소수 찾기			
		findPossiblePrimeNum(maxNum);
		
        return answer;
	}


	private static void findPossiblePrimeNum(int maxNum) {
		for(int i=2; i<maxNum+1; ++i) {
			if(checkPrime[i]) {
				flag = true;
				String str = Integer.toString(i);
				int[] tmp = new int[10];
				for(int j=0; j<10; ++j) {
					tmp[j] = countInputNum[j];
				}
				for(int j=0; j<str.length(); ++j) {
					if( tmp[ str.charAt(j)-'0' ]-- < 1 ) {
						flag = false;
						break;
					}
				}
				
				if(flag) answer++;
			}
		}
		
	}


	private static boolean[] findPrimeNum(int maxNum) {
		checkPrime = new boolean[maxNum+1];
		// i=2~maxNum 까지 소수로 설정		
		for(int i=2; i<maxNum+1; ++i) {
			checkPrime[i]=true;
		}
		
		// 소수 체크			
		for( int i=2, size=(int) Math.sqrt(maxNum); i<size; ++i ) {
			if(checkPrime[i]) {
				for(int j=i*i; j<maxNum+1; j+=i) {
					if(checkPrime[j]) checkPrime[j] = false;
				}
			}
		}
		
		return checkPrime;
	}

	private static int makeMaxNum(String str_numbers) {
		for(int i=0, len = str_numbers.length(); i<len; ++i) {
			tmp = str_numbers.charAt(i)-'0';
			list.add(tmp);
			
			// 사용 가능한 숫자 개수 찾기	
			countInputNum[tmp]++;
		}
		
		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println(list);
		
		StringBuilder sb = new StringBuilder();
		for (int i : list) sb.append(i);
		
		return Integer.parseInt(sb.toString());
	}

}



