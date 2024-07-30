package algorithm_baekjoon;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		Random rn = new Random();
		int T = rn.nextInt(10)+1;
		for(int i=1; i<=T; i++) {
			int A = rn.nextInt(10);
			int B = rn.nextInt(10);
//			int A = sc.nextInt();
//			int B = sc.nextInt();
			System.out.println("Case #" + i + ":" + " " + A + " + " + B + " = " + (A+B));
		}		
	}
}