package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		double[] newScore = new double[n];
		
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			newScore[i] = (double)arr[i] / max;
			sum += newScore[i];
		}
		
		double avg = (sum * 100) / n;
		
		System.out.println(avg);
	}
}
