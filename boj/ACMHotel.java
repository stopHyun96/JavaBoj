package boj;

import java.util.Scanner;

public class ACMHotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		for (int j = 0; j < t; j++) {
			int y = 0;
			int x = 1;
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				if (y == h) {
					y = 1;
					x ++;
				}else {
					y ++;
				}
			}
			System.out.printf("%d%d%d", y,0,x);
		}
	}
}
