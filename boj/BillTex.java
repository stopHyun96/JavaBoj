package boj;
import java.util.Scanner;
public class BillTex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int cost = 0;
		
		for (int i = 1; i <= n; i++) {
			int pay = sc.nextInt();
			int num = sc.nextInt();
			
			cost += pay * num;
		}
		
		if (x == cost) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
