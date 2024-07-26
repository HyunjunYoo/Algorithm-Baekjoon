package algorithm_baekjoon;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);

//		int n = in.nextInt();
		
		Random random = new Random();
		
		int n = random.nextInt(9)+1;
		
		int result = 0;
		
		for(int i=1; i<=n; i++) {
			result += i; 
		}
		System.out.println(result);
	}
}