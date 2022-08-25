package boj;
import java.util.*;
public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (b >= c) {
			System.out.println(-1);
			System.exit(0);
		}
		
		int n = (a / (c - b)) + 1;
		System.out.println(n);
	}
}
