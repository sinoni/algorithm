package 큐_덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_2164_카드2 {
	static int N, tmp;
	static Queue<Integer> q = new LinkedList<Integer>();;
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		for(int i=0; i<N; ++i) {
			q.offer(i);
		}
		while(true) {
			if(q.size()>1) q.poll();
			if(q.size()<2) break;
			q.offer(q.poll());
		}
		System.out.println(q.poll()+1);
	}
}
