package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1874_스택수열 {
	private static int N, tmp, num=1;
	private static Stack<Integer> stack = new Stack<>();
	private static String ans="NO";

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(in.readLine());
		for(int i=0; i<N; ++i) {
			tmp = Integer.parseInt(in.readLine());
			if( num<=N ) {
				// num이 tmp보다 작은 경우 N까지 stack에 push. ( stack.push(num++) )
				if( num<=tmp ) {
					while(num<=tmp) {
						stack.push(num++);
						sb.append("+\n");
					}
				}
			}
			
			if( !stack.isEmpty() && stack.peek()==tmp ) {
				stack.pop();
				sb.append("-\n");
			}
		}
		if(stack.isEmpty()) ans = sb.toString();
		
		System.out.println(ans);
		
	}
}
