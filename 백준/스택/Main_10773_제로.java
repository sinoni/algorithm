package 스택;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_10773_제로 {
	private static int K, tmp, answer=0;
	private static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		for(int i=0; i<K; ++i) {
			tmp = Integer.parseInt(br.readLine());
			if(tmp>0) stack.push(tmp);
			else stack.pop();
		}
		for(int i=0, size = stack.size(); i<size; ++i) {
			answer+=stack.pop();
		}
		System.out.println(answer);
		
	}
}
