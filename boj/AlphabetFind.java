package boj;

import java.io.IOException;
import java.util.Scanner;

public class AlphabetFind {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int[] Alphabet = new int[26];
		
		for (int i = 0; i < Alphabet.length; i++) {
			Alphabet[i] = -1;
		}
		
		for (int i = 0; i < input.length(); i++) {
			int a = input.charAt(i) - 97;
			
			if (Alphabet[a] == -1) {
				Alphabet[a] = i;
			}
		}
		
		for (int i : Alphabet) {
			if (input.length() <= 100) {
				System.out.print(i + " ");
			}
		}
		
	}
}
