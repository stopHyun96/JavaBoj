package boj;

import java.util.*;
public class Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//		체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//		체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//		동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
		
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 2;
		int e = 2;
		int f = 8;
		
		int[] arr = {a, b, c, d, e, f};

		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();
		int d1 = sc.nextInt();
		int e1 = sc.nextInt();
		int f1 = sc.nextInt();
		
		ArrayList<Integer> output = new ArrayList<>();
		
		int[] arr1 = {a1, b1, c1, d1, e1, f1};
		
		for (int i = 0; i < 6; i++) {
			output.add(arr[i] - arr1[i]);
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println(output.get(i));
		}
	}
}
