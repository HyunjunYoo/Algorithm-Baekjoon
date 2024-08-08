package algorithm_baekjoon;

import java.util.Arrays;
import java.util.Scanner;

import java02.Array.array;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// N 바구니 생성
//		int[] N = new int[sc.nextInt()];
//		
//		// N 바구니에 1부터 N까지 숫자 넣기 
//		for(int i=0; i<N.length; i++) {
//			N[i] = i+1;
//		}
//		
//		sc.close();

		int[] arr = {39,40,41,42,43,44,82,83,84,85};
		int[] sss = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] % 42 + ", " );
			sss[i] = arr[i] % 42;
		}
		
		int[] result = Arrays.stream(sss).distinct().toArray();
		System.out.println(result.length);
	
		
	}
}