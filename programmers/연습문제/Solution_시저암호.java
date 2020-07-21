package programmers;

public class Solution_시저암호 {
	public static void main(String[] args) {
		String[] str_arr = {"AB", "z", "a B z", "abcdefg hijklmnop qrs tuv wxyz", "ABCDEFG HIJKLMNOP QRS TUV WXYZ"};
		int[] int_arr = {1, 1, 4, 2, 25};
		for(int i=0; i<5; ++i) {
			String s = str_arr[i];
			int n = int_arr[i];
			
			System.out.println(solution(s, n));
			// answer: "BC" "a" "e F d"
		}
	}

	private static String solution(String s, int n) {
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		// c ASCII -> A: 65, Z: 90, a:97, z: 122	공백: 32		
		for (char c : ch) {
			if(c<'A') {
				sb.append(" ");
				continue;
			}
			
			int calc=c+n;
			if( (c<'a' && calc>'Z') || (c>'Z' && calc>'z') ) calc-=26;
			sb.append((char)calc);
		}
		
		return sb.toString();
	}
}
