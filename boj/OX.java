package boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		String[] ox = new String[num];
		String[] oxElement = null;
		char[] element = null;
		
		for (int i = 0; i < num; i++) {
			ox[i] = br.readLine();
		}
		
		int accrue = 1;
		for (int i = 0; i < num; i++) {
			
			int score = 0;
			
			for (int j = 0; j < num; j++) {
				oxElement = ox[i].split("");
			}
			for (int k = 0; k < oxElement.length; k++) {
				if (k > 0) {
					if (oxElement[k].equals("O")) {
						accrue ++;
					}else if (oxElement[k].equals("X")) {
						accrue = 0;
					}
				}else if (k == 0){
					if (oxElement[k].equals("O")) {
						accrue = 1;
					}else {
						accrue = 0;
					}
				}
				score += accrue;
			}
			System.out.println(score);
		}
		
	}
}
