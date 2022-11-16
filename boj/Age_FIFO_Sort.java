package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Age_FIFO_Sort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[n][2];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			arr[i][0] = Integer.toString(age);
			arr[i][1] = name;
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
		    @Override
			public int compare(String[] o1, String[] o2) {
		    	 return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
	        }	// 나이 순으로 정렬한 뒤 데이터 삽입 순서에 따라 정렬은 자동으로 이루어진다.
	    });
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				bw.write(arr[i][j] + " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
}
