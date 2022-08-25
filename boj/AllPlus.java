package boj;
import java.util.*;
public class AllPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int plus = 0;
		
		for (int i = 1; i <= num; i++) {
			plus = plus + i;
		}
		System.out.println(plus);
	}
}
