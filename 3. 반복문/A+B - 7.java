package algorithm_baekjoon;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
//		int T = sc.nextInt();
		
		Random rd = new Random();
		
		int T = rd.nextInt(10)+1;
		for(int i=1; i<=T; i++) {
			int A = rd.nextInt(10)+1;
			int B = rd.nextInt(10)+1;
//			int A = sc.nextInt();
//			int B = sc.nextInt();
			System.out.println("Case #" + i + ":" + " " + (A+B));
		}		
	}
}