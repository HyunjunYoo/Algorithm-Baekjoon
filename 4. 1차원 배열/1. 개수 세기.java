package algorithm_baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 결과를 저장할 변수 생성
		int result=0;
		
		// N만큼을 값을 저장할 변수 생성
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// 배열에 순서대로 저장
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		// 배열의 길이만큼 반복하여 v와 같은 값이 발생될 때마다 카운터 증가
		for(int j=0; j<arr.length; j++) {
			if(arr[j] == v) {
				result += 1;
			}
		}
		
		System.out.println(result);
	}
}