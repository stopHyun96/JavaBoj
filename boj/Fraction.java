package boj;
import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		long count = 1;
		while (true) {
			n -= count;
			if (n <= 0) {
				n += count;
				break;
			}
			count++;
		}
		
		if(count % 2 == 0) {
			System.out.println(n + "/" + (count - n + 1));
		}else {
			System.out.println((count - n + 1) + "/" + n);
		}
	}
}
