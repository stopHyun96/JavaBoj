package boj;

import java.util.Scanner;

public class HoneyComb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 1;
		int sum = 1;
		while (true) {
			if(n <= sum) {
				break;
			}
			sum += count * 6;
			count ++;
		}
		
		System.out.println(count);
	}
}
