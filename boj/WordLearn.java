package boj;

import java.util.Scanner;

public class WordLearn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		String input = sc.next();
		
		for (int i = 0; i < input.length(); i++) {
			
			if('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
				arr[input.charAt(i) - 'A'] ++;		//입력된 알파벳이 A(65)보다 크거나 Z(80)보다 작으면 입력된 알파벳에서 A(65) 만큼 빼준다. 
			}else {
				arr[input.charAt(i) - 'a'] ++;		//그 외의 경우 입력된 알파벳에서 a(97) 만큼 빼준다.
			}
		}
		
		int max = 0;
		char result = '?';
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = (char)(i + 65);
			}else if (arr[i] == max) {
				result = '?';
			}
		}
		
		System.out.println(result);
	}
}
