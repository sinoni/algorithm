package 큐_덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main_5430_AC {
	static int T, n;
	static String p, str;
	static Deque<Integer> dq;
	
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());
		for(int t=0; t<T; ++t) {
			p = in.readLine();
			n = Integer.parseInt(in.readLine());
			str = in.readLine();
			str = str.substring(1, str.length()-1);
			StringTokenizer st = new StringTokenizer(str, ",");
			
			// dq 채우기	
			dq = new LinkedList<Integer>();
			for(int i=0; i<n; ++i) {
				dq.offer(Integer.parseInt(st.nextToken()));
			}
//			System.out.println("dq: "+ dq);
			
			// p 함수 실행		
			boolean isError=false, reverse=false;
FOR:		for(int i=0, len = p.length(); i<len; ++i) {
				switch (p.charAt(i)) {
				case 'R':
					reverse = !reverse;
					break;
					
				case 'D':
					if(dq.isEmpty()) {
						isError = true;
						break FOR;
					}
					
					// 앞에서부터 삭제	poll
					if(!reverse) 	dq.removeFirst();
					// 뒤에서부터 pop	
					else 			dq.removeLast();
					break;

				default:
					break;
				}
			}
			
			// 출력	
			if(isError) System.out.println("error");
			else {
				StringBuilder sb = new StringBuilder("[");

				if(!reverse) {
					while(dq.size()>1) {
						sb.append(dq.pollFirst()).append(",");
					}
				}else {
					while(dq.size()>1) {
						sb.append(dq.pollLast()).append(",");
					}
				}
				
				if(dq.size()==1) sb.append(dq.pollLast());
				sb.append("]");
				
				System.out.println(sb.toString());
			}
		}
		
	}
}
