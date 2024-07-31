package algorithm_baekjoon;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		
		Random rd = new Random();
		
		int N = rd.nextInt(10)+1;
		
		for(int i=1; i<=N; i++) {
			for(int j=N; j>=i; j--) { System.out.print(" "); }
			
			for(int k=1; k<=i; k++) { System.out.print("*"); }
			
			System.out.print("\n");
		}		
	}
}