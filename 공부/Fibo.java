package homework;

import java.util.Scanner;

public class Fibo {	//피보나치 수열 하향식 ->엄청난 중복 호출이 발생한다.
	
	private static int fibonacci(int n) {
		if(n<=2) return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	private static int fibonacci(int count, int before, int current) {	//배열 쓰지 않고, 상향
		
		if (count==1) return current;
		
		return fibonacci(--count, current, before+current);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacci(n,0,1));
		System.out.println(fibonacci(n));
	}

}
