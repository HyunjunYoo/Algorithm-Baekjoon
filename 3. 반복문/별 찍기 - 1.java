package algorithm_baekjoon;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		
		Random rd = new Random();
		
		int N = rd.nextInt(10);
		System.out.println(N);
		
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("★");				
			}
			System.out.println();
		}		
	}
}