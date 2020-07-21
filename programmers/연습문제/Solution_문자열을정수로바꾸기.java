package programmers;

public class Solution_문자열을정수로바꾸기 {
	public static void main(String[] args) {
		String[] str_arr = {"1234", "-1234"};
		for(int i=0, len=str_arr.length; i<len; ++i) {
			System.out.println(solution0(str_arr[i]));
			System.out.println(solution(str_arr[i]));
		}
		
	}

	private static int solution(String s) {
		int num=0;
		boolean sign = true;
		for(int i=0, len=s.length(); i<len; ++i) {
			char ch = s.charAt(i);
			
			if(ch=='-') sign = false;
			else if (ch!='+') num = 10 * num + (ch-'0');
		}
		return sign? num:-1*num;
	}

	private static int solution0(String s) {
        return Integer.parseInt(s);
	}
}
