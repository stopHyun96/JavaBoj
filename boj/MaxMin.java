package boj;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxMin {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = sc.nextInt();
		}
		
		int max = numArr[0];
		int min = numArr[0];
		
		for (int i : numArr) {
			if (i > min) {
				min = i;
			}
			
			if (i < max) {
				max = i;
			}
		}
		
		System.out.println(max + " " + min);
		
	}

}
