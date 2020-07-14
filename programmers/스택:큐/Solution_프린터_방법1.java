package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution_프린터_방법1 {
	public static void main(String[] args) {
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0;
		
		System.out.println(solution(priorities, location));
	}
	
	static PriorityQueue<Integer> pq;
	private static int solution(int[] priorities, int location) {
		int answer = 0;
		int len = priorities.length;
		pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0; i<len; ++i) {
			pq.offer(priorities[i]);
		}
		System.out.println(pq);
		
		while(!pq.isEmpty()){
            for(int i=0; i<len; ++i){
                if( pq.peek() == priorities[i] ) {
                	pq.poll();
                    answer++;
                    
                    if(i == location){
                        return answer;
                    }
                }
            }
        }
		
        return answer;
	}
}
