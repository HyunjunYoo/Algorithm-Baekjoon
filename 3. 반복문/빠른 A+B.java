package algorithm_baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// 표준 입력을 받기 위해 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 표준 출력을 하기 위해 생성
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 문자열을 토큰 단위로 나누기 위한 객체 선언
		StringTokenizer st;
		
		// 첫 번째 입력 줄을 읽어 정수로 변환하여 'T'에 저장(테스트 케이스의 수를 의미)
		int T = Integer.parseInt(br.readLine());
		
		// 'T'번 반복하는 루프를 시작
		for(int i=0; i<T; i++) {
			// 각 줄의 입력을 받아 공백을 기준으로 문자열을 분리
			st = new StringTokenizer(br.readLine());
			// 분리된 두 숫자를 정수로 변환하여 더한 후, 그 결과를 출력
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
			
		}
		
		// BuffereadWriter를 닫음
		bw.close();	
		
	}
}