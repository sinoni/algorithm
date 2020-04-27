package programmers;

import java.util.Arrays;

public class Solution_모의고사 {
	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
		int[] answers2 = {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(answers)));
		System.out.println(Arrays.toString(solution(answers2)));
	}
	
	
	static int r, size, max;
	static int[] answer, student1, student2, student3, tmp=new int[4];
	private static int[] solution(int[] answers) {
		
		int ans_length = answers.length;
		
		if(ans_length<40) 	size =40;
		else 			size = ans_length;
		student1 = new int[size];
		student2 = new int[size];
		student3 = new int[size];
		
		// 배열 채우기				
		for(int n=0; n<40; ++n) {
			student1[n] = n%5+1;
			if(n%2==0) 	student2[n]=2;
			else {
				r=n%8;
				if(r==1) student2[n]=1;
				if(r==3) student2[n]=3;
				if(r==5) student2[n]=4;
				if(r==7) student2[n]=5;
			}
			
			r=(n%10)/2;
			if(r==0) student3[n]=3;
			else if(r==1) student3[n]=1;
			else if(r==2) student3[n]=2;
			else if(r==3) student3[n]=4;
			else if(r==4) student3[n]=5;
		}
		
		if(ans_length>40) {
			for(int n=40; n<ans_length; ++n) {
				r = n%40;
				student1[n] = student1[r];
				student2[n] = student2[r];
				student3[n] = student3[r];
			}
			
		}
		
		// 정답맞추기	
		int cnt1=0, cnt2=0, cnt3=0;
		for(int i=0; i<ans_length; ++i) {
			if(student1[i]==answers[i]) cnt1++;
			if(student2[i]==answers[i]) cnt2++;
			if(student3[i]==answers[i]) cnt3++;
		}
		
		max = Math.max(cnt3, (Math.max(cnt1, cnt2)));
		
		size=0;
		if(max==cnt1) tmp[size++]=1;
		if(max==cnt2) tmp[size++]=2;
		if(max==cnt3) tmp[size++]=3;
		
		answer = new int[size];
		for(int i=0; i<size; ++i) {
			answer[i] = tmp[i];
		}
		
        return answer;
    }
}
