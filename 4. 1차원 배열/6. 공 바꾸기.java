package algorithm_baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 바구니 생성
		int[] N = new int[sc.nextInt()];
		
		// N 바구니에 1부터 N까지 숫자 넣기 
		for(int i=0; i<N.length; i++) {
			N[i] = i+1;
		}
		
		// M for문 반복횟수
		int M = sc.nextInt();
		
		// 배열은 0부터 시작하므로 스캐너로 받은 숫자에서 -1씩하기
		for(int x=0; x<M; x++) {
			int i = sc.nextInt(); 
			int j = sc.nextInt(); 
			int temp = N[i-1];
			N[i-1] = N[j-1];
			N[j-1] = temp;
		}
		
		for(int x : N) {
			System.out.print(x + " ");
		}
		
		sc.close();
	}
}