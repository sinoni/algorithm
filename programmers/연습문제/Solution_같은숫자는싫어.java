package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_같은숫자는싫어 {
	public static void main(String[] args) {
		int[][] input = {	{1, 1, 3, 3, 0, 1, 1},
							{4, 4, 4, 3, 3}	};
		for (int[] arr : input) {
			System.out.println(Arrays.toString(arr));
			System.out.println(Arrays.toString(solution(arr)));
			// answer: 	[1, 3, 0, 1]
			//			[4, 3]
		}
	}

	private static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        int j=0;
        for(int i=1, len=arr.length; i<len; ++i) {
        	if(list.get(j)==arr[i]) continue;
        	list.add(arr[i]);
        	j++;
        }
        
        int size = list.size();
        int[] answer = new int[size];
        for(int i=0; i<size; ++i) {
        	answer[i] = list.get(i);
        }
//        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
	}
}
