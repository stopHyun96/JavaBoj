package boj;
import java.util.*;
import java.io.*;
public class XSmall {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int[] ns = new int[n];
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			ns[i] = Integer.parseInt(st2.nextToken());
			
			if(ns[i] < x) {
				bw.write(String.valueOf(ns[i]) + " ");
			}
		}
		bw.flush();
		
		br.close();
		bw.close();
		
	}
}