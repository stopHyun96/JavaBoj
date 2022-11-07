package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NumberSort2 {
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
			public int compare(int[] o1, int[] o2) {
		    	 if(o1[0] == o2[0]) {
	                	 return o1[1] - o2[1];
		    	 }else {
		    		 return o1[0] - o2[0]; 
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
