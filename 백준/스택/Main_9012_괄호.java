package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012_괄호 {
	private static int T;
	private static Stack<Character> stack;

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int t=0; t<T; ++t) {
			stack = new Stack<>();
			String ans = "YES";
			String str = br.readLine();
			for(int i=0, len = str.length(); i<len; ++i) {
				if( str.charAt(i) == '(' ) {
					stack.push( '(' );
				}else {
					if(stack.isEmpty()) {
						ans="NO";
						break;
					}
					stack.pop();
				}
			}
			if(!stack.isEmpty()) ans="NO";
			System.out.println(ans);
		}
	}
}
