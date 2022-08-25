package boj;
import java.util.Scanner;
public class Alarm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if (hour >= 0 && hour <= 23 && min >= 0 && min <= 59) {
			min -= 45;
			if(min < 0) {
				min = 60 + min;
				hour -= 1;
				if (hour == -1) {
					hour = 23;
					System.out.println(hour);
					System.out.println(min);
				}else {
					System.out.println(hour);
					System.out.println(min);
				}
			}else {
				System.out.println(hour);
				System.out.println(min);
			}
		}
	}
}