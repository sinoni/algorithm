package programmers;

import java.util.LinkedList;

public class Solution_프린터_방법2 {
	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		System.out.println(solution(priorities, location));
	}
	
	static class Document {
		int priority;
		int loc;
		public Document(int priority, int loc) {
			super();
			this.priority = priority;
			this.loc = loc;
		}
		@Override
		public String toString() {
			return "Document [priority=" + priority + ", loc=" + loc + "]";
		}
		
	}
	
	static LinkedList<Document> list;
	static Document document;
	private static int solution(int[] priorities, int location) {
		int answer = 1;
		list = new LinkedList<Document>();
		for(int i=0; i<priorities.length; ++i) {
			list.add(new Document(priorities[i], i));
		}
		
		while(list.size()>1) {
			document = list.removeFirst();
			
			for(int i=0, size = list.size(); i<size; ++i) {
				if(document.priority<list.get(i).priority) {
					list.add(document);
					break;
				}
				
				// 가장 큰 값이 제일 앞에 있을 경우 출력		
				if(i==size-1) {
					if(document.loc==location) {
						return answer;
					}
					answer++;
				}
			}
			
		}
		
        return answer;
	}
}
