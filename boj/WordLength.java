package boj;

import java.util.Scanner;

public class WordLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		int cnt = 0;
		
		String[] sArr = s.split(" ");
		
		for (String string : sArr) {
			cnt ++;
			if (string.equals("")) {
				cnt -= 1;
			}else {
				cnt = cnt;
			}
		}
		
		System.out.println(cnt);
	}
}