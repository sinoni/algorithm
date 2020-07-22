package programmers;

public class Solution_문자열내p와y의개수 {
	public static void main(String[] args) {
		String[] input = {"pPoooyY", "Pyy"};
		for (String s : input) {
			System.out.println(solution(s));
		}
		// answer: true, false
	}

	private static boolean solution(String s) {
		int p=0, y=0;
		for(int i=0; i<s.length(); ++i) {
			char ch=s.charAt(i);
			if(ch=='p' || ch=='P') p++;
			else if(ch=='y' || ch=='Y') y++;
		}
		
		return p==y;
	}
}
