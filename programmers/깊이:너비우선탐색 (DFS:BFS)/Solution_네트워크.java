package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_네트워크 {
	public static void main(String[] args) {
		int n = 3;
//		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};
		System.out.println(solution(n, computers));
	}

	static Queue<Integer> q = new LinkedList<Integer>();
	static int y;
	static boolean[] check;

	private static int solution(int n, int[][] computers) {
		int answer=0;
		check = new boolean[n];
		for (int i = 0; i < n; ++i) {
			if (check[i]) continue;
			answer++;
			q.add(i);
			check[i] = true;
			while (!q.isEmpty()) {
				y = q.poll();
				for (int j = 0; j < n; ++j) {
					if (computers[y][j] < 1 || y == j) continue;
					q.add(j);
					check[j] = true;
					computers[y][j] = 0;
					computers[j][y] = 0;
				}
			}
		}

		return answer;
	}
}
