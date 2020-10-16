package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WhileTest {

	public void WhileTest1() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				sc.close();
				break;
			}
			System.out.println(a + b);
		}
	}

	public void WhileTest1sbu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0) {
				break;
			}
			sb.append(a + b).append("\n");
		}
		System.out.println(sb);
	}

	public void WhileTest2() {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}
		sc.close();
	}
	/*
	 * hasNextInt(), hasNext(), hasNextLine() 중 아무거나 써도 무방 -> 입력이 아예 들어오지 않기 때문에 예외가
	 * 발생하는 형태는 같음. 그래도 nextInt() 를 통해 정수를 입력받고자 했으니 hasNextInt() 를 써주는게 다른 코딩할 때도
	 * 착오가 발생하지 않음. 참고로 hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며 정수가 아닐경우 바로 예외를 던지며
	 * 더이상의 입력을 받지 않고 hasNextInt()에서 false를 반환하면서 반복문이 종료.
	 */

	public void WhileTest2sbu() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;

		while ((str = br.readLine()) != null) {

			st = new StringTokenizer(str, " ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			sb.append(a + b).append("\n");
		}
		System.out.println(sb);
	}
	// 10951번 bufferredreader로 실행안됨. 해보기

	public void WhileTest3() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int copy = n;
		int count = 0;

		while (true) {
			n = ((n % 10) * 10) + ((n / 10 + n % 10) % 10);
			System.out.println(n);
			count++;

			if (copy == n) {
				break;
			}
		}
		System.out.println(count);
	}
	/*
	 * import java.io.*;
import java.util.*;

// 1110
// 더하기 사이클 다른 소스.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String result = line; // 최초의 값 저장
        int n = 0; // 총 횟수

        // 입력 값이 0이면 1출력
        if(line.equals("0")) {
            System.out.println(1);
            return;
        }

        // 입력 값이 10미만의 값이면 0 추가
        if(line.length() == 1) {
            line += "0";
            result += "0";
        }

        while(true) {
            String tmp = String.valueOf((Integer.parseInt(line.substring(0, 1)) + Integer.parseInt(line.substring(1, 2))));
            String sub = line.substring(1,2);
            line = sub; 
            if(Integer.parseInt(tmp) >= 10)
                line += tmp.substring(1,2);
            else line += tmp;
            n++;
            if(result.equals(line)) {
                System.out.println(n);
                break;
            }
        }
    }
}
	 */

}
