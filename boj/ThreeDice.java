package boj;
import java.util.Scanner;
public class ThreeDice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int money = 0;
		
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		
		if (a == b && a == c) {
			money = 10000 + (a * 1000);
			System.out.println(money);
		}else if (a == b || a == c) {
			money = 1000 + (a * 100);
			System.out.println(money);
		}else if (b == c) {
			money = 1000 + (b * 100);
			System.out.println(money);
		}else if (a != b && a != c){
			System.out.println(max * 100);
		}
	}
}
