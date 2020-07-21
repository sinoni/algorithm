package programmers;

public class Solution_서울에서김서방찾기 {
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Ki", "", "K", "Kim"};
		System.out.println(solution(seoul));
		System.out.println(solution0(seoul));
	}
	
	private static String solution0(String[] seoul) {
		for(int i=0; i<seoul.length; ++i) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다";
			}
		}
		return "";
	}
	
	private static String solution(String[] seoul) {
		for(int i=0; i<seoul.length; ++i) {
			if(seoul[i].length()!=3) continue;
			
			for(int j=0; j<3; ++j) {
				if( seoul[i].charAt(0)=='K'  &&  seoul[i].charAt(1)=='i'  && seoul[i].charAt(2)=='m') {
					return "김서방은 " + i + "에 있다";
				}
			}
		}
		return "";
	}
}
