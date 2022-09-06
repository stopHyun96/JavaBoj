package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ForPlus {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		String[] arr = new String[num];
		
		String number = br.readLine();
		
		for (int i = 0; i < num; i++) {
			arr = number.split("");
			sum += Integer.valueOf(arr[i]);
 		}
		
		bw.write(sum + "\n");
		
		bw.flush();
		bw.close();
	}
}
