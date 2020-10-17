package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WhileTest {
//깃테스트123 로컬에서 한글입력
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
	 * hasNextInt(), hasNext(), hasNextLine()
	 * */

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
	// 1095

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
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String result = line; 
        int n = 0; // �� Ƚ��

        
        if(line.equals("0")) {
            System.out.println(1);
            return;
        }

        
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
