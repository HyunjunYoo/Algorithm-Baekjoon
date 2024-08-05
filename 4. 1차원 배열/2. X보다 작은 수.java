package algorithm_baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// N만큼을 값을 저장할 변수 생성
		int N = sc.nextInt();
		int[] A = new int[N];
		
		// 값을 비교할 변수 생성
		int X = sc.nextInt();
		
		// 배열에 순서대로 저장
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		
		// 배열의 길이만큼 반복하여 X보다 작은 A[j]의 값을 출력
		for(int j=0; j<A.length; j++) {
			if(A[j] < X) {
				System.out.print(A[j] + " ");
			}
		}
	}
}