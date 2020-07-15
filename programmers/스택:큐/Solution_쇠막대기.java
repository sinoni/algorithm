package programmers;

import java.util.Stack;

public class Solution_쇠막대기 {
	public static void main(String[] args) throws Exception{
		String arrangement = "()(((()())(())()))(())";
		System.out.println(solution(arrangement));
		// answer = 17
	}

	private static int solution(String arrangement) {
		int answer=0;
		
		Stack<Character> stack = new Stack<>();
		for(int i=0, len = arrangement.length(); i<len; ++i) {
			char c = arrangement.charAt(i);
			
			if(c=='(') {
				stack.push(c);
			}else {
				stack.pop();
				if (arrangement.charAt(i-1)=='(') answer+=stack.size();
				else answer+=1;
			}
		}
		
		return answer;
	}
}
