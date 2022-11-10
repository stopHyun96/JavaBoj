package boj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			
			arr[i] = a;
		}
		
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
		arr = hashSet.toArray(new String[0]);
		
		Arrays.sort(arr, new Comparator<String>() {
		    @Override
			public int compare(String o1, String o2) {
		    	 if(o1.length() != o2.length()) {
		    		 return o1.length() - o2.length();
		    	 }else {
		    		 return o1.toString().compareTo(o2.toString());
		    	 }
	        }
	    });
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
