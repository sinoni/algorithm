package programmers;

public class Solution_핸드폰번호가리기 {
	public static void main(String[] args) {
		String[] phone_numbers = {	"01033334444", "027778888", "5555" };
		for(int i=0; i<phone_numbers.length; ++i) {
			System.out.println(solution(phone_numbers[i]));
		}
	}

	private static String solution(String phone_number) {
		StringBuilder sb = new StringBuilder();
		int len = phone_number.length();
		for(int i=0; i<len-4; ++i) {
			sb.append("*");
		}
		String last = phone_number.substring(len-4);
        return sb.append(last).toString();
	}
}
