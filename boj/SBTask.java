package boj;

import java.util.Scanner;

public class SBTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numA = sc.next();
		String numB = sc.next();
		
		StringBuilder sbA = new StringBuilder(numA);
		StringBuilder sbB = new StringBuilder(numB);
		String reverseA = sbA.reverse().toString();
		String reverseB = sbB.reverse().toString();
		
		int revA = Integer.parseInt(reverseA);
		int revB = Integer.parseInt(reverseB);
		
		if (revA > revB) {
			System.out.println(revA);
		}else {
			System.out.println(revB);
		}
	}
}
