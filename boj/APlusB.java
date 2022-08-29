package boj;
import java.util.*;
import java.io.*;
public class APlusB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = a + b;
			
			
			if (c != 0) {
				bw.write(String.valueOf(c) + "\n");
			}else {
				break;
			}
		}
		bw.flush();
		bw.close();
	}
}
