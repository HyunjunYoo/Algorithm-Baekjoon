package algorithm_baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n = new int[N];
		
		for(int i=0; i<N; i++) {
			n[i] = sc.nextInt();
		}
		
		int min = n[0];
		int max = n[0];
		
		for(int i=1; i<n.length; i++) {
			if((min > n[i])) {
				min = n[i];
			}if(max < n[i]) {
				max = n[i];
			}
		}

		System.out.println(min + " " + max);
		
		sc.close();

	}
}
