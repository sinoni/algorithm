package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_4949_균형잡힌세상 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = in.readLine();
			if(str.length()==1) break;
			String ans = "yes";
			Stack<Character> stack = new Stack<Character>();
			
FOR:		for(int i=0, len = str.length(); i<len; ++i) {
				switch (str.charAt(i)) {
				case '(':
					stack.push('(');
					break;
				case ')':
					if(!stack.isEmpty() && stack.peek()=='(') stack.pop();
					else {
						ans="no";
						break FOR;
					}
					break;
					
				case '[':
					stack.push('[');
					break;
				case ']':
					if(!stack.isEmpty() && stack.peek()=='[') stack.pop();
					else {
						ans="no";
						break FOR;
					}
					break;

				default:
					break;
				}
			}
			if(!stack.isEmpty()) ans="no";
			System.out.println(ans);
		}
	}
}
