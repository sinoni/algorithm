package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_기능개발 {
	static int[] progresses = {93, 35, 55};
	static int[] speeds = {1, 30, 5};
	public static void main(String[] args) {
//		solution(progresses, speeds);
		System.out.println(Arrays.toString(solution(progresses, speeds)));
		
	}
	
	static Queue<Integer> q = new LinkedList<Integer>();
	static int val, p, r, tmp, size=0;
	static int[] arr = new int[100];
	private static int[] solution(int[] progresses, int[] speeds) {
		for(int i=0, length = progresses.length; i<length; ++i) {
			tmp = 100-progresses[i];
			p = tmp/speeds[i];
			r = tmp%speeds[i];
			if(r>0) tmp = p+1;
			else 	tmp = p;
			
			if(i<1) val = tmp;
			if(val<tmp) {
				arr[size++] = q.size();
				q.clear();
				val = tmp;
			}
			q.offer(tmp);
			
		}
		
		if(!q.isEmpty()) arr[size++] = q.size();
		int[] answer = new int[size];
		for(int i = 0; i<size; ++i) {
			answer[i] = arr[i];
		}
		
		return answer;
	}
}
