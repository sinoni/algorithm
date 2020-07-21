package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_직사각형별찍기 {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();
		for(int j=0; j<n; ++j) {
			sb.append("*");
		}
		for(int i=0; i<m; ++i) {
			System.out.println(sb.toString());
		}
	}
}
