package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_타겟넘버 {
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		System.out.println(solution(numbers, target));
	}

	static Queue<Integer> q = new LinkedList<Integer>();
	static int x, n, answer=0, size;

	private static int solution(int[] numbers, int target) {
		q.offer(numbers[0]);
		q.offer(numbers[0]*-1);

		for (int i = 1, length = numbers.length; i < length; ++i) {
			n = numbers[i];
			size=q.size();
			for (int j = 0; j < size; ++j) {
				x = q.poll();
				q.offer(x+n);
				q.offer(x-n);
			}
		}
		
		while (!q.isEmpty()) {
			x = q.poll();
			if(x==target) answer++;
		}

		return answer;
	}
}
