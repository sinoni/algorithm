package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_10828_스택 {
	static int N;
	static Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		
		for(int i=0; i<N; ++i) {
			StringTokenizer st = new StringTokenizer(in.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				System.out.println( stack.isEmpty()? -1:stack.pop() );
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println( stack.isEmpty()? 1:0 );
				break;
			case "top":
				System.out.println( stack.isEmpty()? -1:stack.peek() );
				break;

			default:
				break;
			}
			
		}
	}
}
