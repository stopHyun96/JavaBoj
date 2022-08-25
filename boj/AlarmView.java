package boj;
import java.util.Scanner;
public class AlarmView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Alarm1 al = new Alarm1();
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		al.show(hour, min);
		
	}
}

class Alarm1 {
	
	int hour;
	int min;
	
	public void show(int hour, int min) {
		this.hour = hour;
		this.min = min;
		
		if ((hour > 0 || hour <= 24) && (min >= 0 || min < 60)) {
			min -= 45;
			if(min < 0) {
				min = 60 + min;
				hour -= 1;
				if (hour == -1) {
					hour = 23;
					System.out.println(hour);
					System.out.println(min);
				}
			}
		}
	}
}