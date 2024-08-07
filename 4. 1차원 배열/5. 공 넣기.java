package algorithm_baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] n = new int[9];
//		for(int i=0; i<n.length; i++) {
//			n[i] = sc.nextInt();
//		}
		
		int[] n = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		int max = 0;
		int count = 0;
		int index = 0;
		

		for(int value : n) {
			count++;
			
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(count);
		System.out.println(max + "\n" + index );
		
//		sc.close();

	}
}