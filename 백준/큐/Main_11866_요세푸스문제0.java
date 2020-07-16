package 큐_덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_11866_요세푸스문제0 {
	static int N, K;
	static Queue<Integer> q = new LinkedList<Integer>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		K = Integer.parseInt(st.nextToken())-1;
		for(int i=1; i<=N; ++i) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!q.isEmpty()) {
			for(int i=0; i<K; ++i) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		sb.replace(sb.length()-2, sb.length(), ">");
		System.out.println(sb.toString());
	}
}
