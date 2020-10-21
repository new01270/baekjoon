package co.syeon.baekjoon;

import java.util.Scanner;

public class WhileRe {

	//10952
	public void wRe() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0)
				break;

			System.out.println(a + b);
		}
	}
	
	
	
	/*
	 * sc.next() -> 다음 토큰을 읽습니다.
	 * sc.nextLine() -> 다음 행을 읽습니다.
	 * sc.hasNext() -> 토큰이 있는지 확인하고 boolean을 리턴합니다. 공백의 경우 무시합니다.
	 * sc.hasNextLine() -> 행이 있는지 확인 후 boolean을 리턴합니다. 줄바뀜이 있으면 true를 리턴합니다.
	 */
	
	//10951
	public void wRe2() {
		
	}
}//end
