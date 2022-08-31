package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PlusCycle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.parseInt(br.readLine());
		int startNum = x;
		int cnt = 0;
		
		while (true) {
			cnt ++;
			int n1 = x % 10;
			int n10 = x / 10;
			
			int m = n1 + n10;
			int k = (n1 * 10) + m % 10;
			
			x = k;
			
			if (k == startNum) {
				break;
			}
		}
		
		System.out.println(cnt);
	}
}
