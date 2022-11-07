package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NumberSortY {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		int idx = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[i][idx] = x;
			arr[i][idx + 1] = y;
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
		    @Override
			public int compare(int[] o1, int[] o2) {	// 변수 o1과 o2를 선언
		    	 if(o1[1] == o2[1]) {					// o1[1]과 o2[1] ==> y 가 서로 같다면
	                	 return o1[0] - o2[0];			// o1[0]과 o2[0] ==> x 를 비교하여 정렬해 반환
		    	 }else {
		    		 return o1[1] - o2[1]; 				// 아니라면 o1[1]과 o2[1] ==> y값을 비교하여 출력
		    	 }
	        }
	    });
		
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i][idx] + " ");
			bw.write(arr[i][idx + 1] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
