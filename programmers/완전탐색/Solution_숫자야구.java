package 완전탐색;

import java.util.HashSet;
import java.util.Iterator;

public class Solution_숫자야구 {
	public static void main(String[] args) {
		int[][] baseball = {{123, 1, 1}, 
							{356, 1, 0}, 
							{327, 2, 0}, 
							{489, 0, 1}};
							// 숫자, 스트라이크, 볼		
							// answer = 2
		System.out.println(solution(baseball));
	}
	
	
	private static int strike, ball;
	private static String str;
	private static Character c0, c1, c2;
	
	private static int solution(int[][] baseball) {
		
		// 123 ~ 987 모든 숫자 HashSet에 저장		
		HashSet<String> set = new HashSet<String>();
		for(int i=123; i<987; ++i) {
			str = String.valueOf(i);
			c0 = str.charAt(0);
			c1 = str.charAt(1);
			c2 = str.charAt(2);
			if( c0==c1 || c1==c2 || c2==c0
					|| c1=='0' || c2=='0' ) continue;
			set.add(str);
		}
		
		// 비교	
		for(int i=0, len = baseball.length; i<len; ++i) {
			str = String.valueOf(baseball[i][0]);
			
			for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
				String tmp = (String) iterator.next();
				
				//  strike	확인		
				strike = 0;
				for(int j=0; j<3; ++j) {
					if(tmp.charAt(j)==str.charAt(j)) strike++;
				}
				if(strike!=baseball[i][1]) iterator.remove();
				// ball 확인	
				else {
					ball = 0;	
					for(int j=0; j<3; ++j) {
						if( tmp.contains( String.valueOf(str.charAt(j)) ) ) ball++;
					}
					if(ball!=baseball[i][2]+baseball[i][1]) iterator.remove();
				}
				
			}
			
		}
		
		return set.size();
	}
}
