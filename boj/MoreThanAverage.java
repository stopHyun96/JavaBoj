package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoreThanAverage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int subcase = Integer.parseInt(br.readLine());
		int num = 0;
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		for (int i = 0; i < subcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num = Integer.parseInt(st.nextToken());
			int[] score = new int[num];
			for (int j = 0; j < score.length; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			avg = sum / num;
			sum = 0;
			
			for (int j : score) {
				if (avg < j) {
					count ++;
				}
			}
			double percentage = (double)count / num * 100;
			
			System.out.printf("%.3f", percentage);
			System.out.print("%" + "\n");
			count = 0;
		}
	}
}

