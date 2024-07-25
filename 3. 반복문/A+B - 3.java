package algorithm_baekjoon;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);

		int T = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		
		for(int i=0; i<T; i++) {
			int result = A + B;
			System.out.println(result);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner	in = new Scanner(System.in);

		int T = in.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			int result = A + B;
			System.out.println(result);
		}
	}
}

// 처음에는 변수의 선언을 모두 for문 밖에 선언하여서 계속 실패를 하였다. 
// 입력 방식: 첫 번째 버전은 A와 B를 한 번만 입력받고, 
// 			두 번째 버전은 루프마다 A와 B를 새로 입력받는다.
// 출력 결과: 첫 번째 버전은 항상 동일한 결과를 T번 출력하지만, 
// 			두 번째 버전은 매번 다른 입력값에 따라 다른 결과를 출력한다.
// 위의 이유로 인해 출력값이 바뀌게 된 것이다.