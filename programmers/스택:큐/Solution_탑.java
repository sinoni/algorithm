package programmers;

import java.util.Arrays;
import java.util.Stack;

public class Solution_탑 {
	static class Tower {
		int index;
		int height;
		
		public Tower(int index, int height) {
			super();
			this.index = index;
			this.height = height;
		}
	}
	
	public static void main(String[] args) {
//		int[] heights = {6,9,5,7,4};
//		int[] heights = {3,9,9,3,5,7,2};
		int[] heights = {1,5,3,6,7,6,5};
		System.out.println(Arrays.toString(solution(heights)));
	}
	
	static Stack<Tower> stack = new Stack<>();
	static int[] arr;
	static Tower top;
	private static int[] solution(int[] heights) {
		int len = heights.length;
		arr = new int[len];
		
		for(int i=0; i<len; ++i) {
			Tower tower = new Tower(i+1, heights[i]);
			
			while(!stack.isEmpty() && stack.peek().height<=tower.height) stack.pop();
			
			if(stack.isEmpty()) arr[i] = 0;
			else arr[i] = stack.peek().index;
			
			stack.push(tower);
		}
		
        return arr;
    }
}
