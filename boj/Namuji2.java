package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Namuji2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] numArr = new int[10];
		int cnt = 0;
		
		
		for (int i = 0; i < numArr.length; i++) {
			int num = Integer.parseInt(br.readLine());
			
			numArr[i] = num % 42;
		}
		
		int[] distinct = Arrays.stream(numArr).distinct().toArray();
		System.out.println(distinct.length);
		
	}
	
}
