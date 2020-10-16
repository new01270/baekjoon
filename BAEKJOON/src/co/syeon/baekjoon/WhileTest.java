package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WhileTest {
//백준
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
	 * hasNextInt(), hasNext(), hasNextLine() �� �ƹ��ų� �ᵵ ���� -> �Է��� �ƿ� ������ �ʱ� ������ ���ܰ�
	 * �߻��ϴ� ���´� ����. �׷��� nextInt() �� ���� ������ �Է¹ް��� ������ hasNextInt() �� ���ִ°� �ٸ� �ڵ��� ����
	 * ������ �߻����� ����. ����� hasNextInt() �� ��� �Է°��� �����ϰ�� true�� ��ȯ�ϸ� ������ �ƴҰ�� �ٷ� ���ܸ� ������
	 * ���̻��� �Է��� ���� �ʰ� hasNextInt()���� false�� ��ȯ�ϸ鼭 �ݺ����� ����.
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
	// 10951�� bufferredreader�� ����ȵ�. �غ���

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
// ���ϱ� ����Ŭ �ٸ� �ҽ�.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        String result = line; // ������ �� ����
        int n = 0; // �� Ƚ��

        // �Է� ���� 0�̸� 1���
        if(line.equals("0")) {
            System.out.println(1);
            return;
        }

        // �Է� ���� 10�̸��� ���̸� 0 �߰�
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
