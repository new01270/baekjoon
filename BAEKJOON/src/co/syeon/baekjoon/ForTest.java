package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ForTest {

	public void forTest2() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a + b));
		}
		sc.close();
	}

	public void forTest3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += (n - i);
		}
		System.out.println(result);
		sc.close();
	}

	public void forTest4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");

		}
		br.close();
		bw.flush();
		bw.close();
	}

	public void forTest5s() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}

	public void forTest5b() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public void forTest6() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		sc.close();
	}

	public void forTest6b() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = n; i > 0; i--) {
			bw.write(i + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public void forTest7s() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
//			System.out.println("Case #" + i + ": " + (a + b));
			System.out.printf("Case #%d: %d \n", i, (a + b));
		}
		sc.close();
	}

	public void forTest7b() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			bw.write(
					"Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

	public void forTest7sbu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			sb.append("Case #").append(i).append(": ")
					.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

	public void forTest8s() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
//			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
			System.out.printf("Case #%d: %d + %d = %d \n", i, a, b, (a + b));
			// 컴파일 속도: println < printf
		}
	}

	public void forTest8b() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());

		for (int i = 1; i <= t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

	public void forTest8btry() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			int t = Integer.parseInt(br.readLine());
			for (int i = 1; i <= t; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) + "\n");

			}
			br.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void forTest9() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public void forTest9sbu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();
		int n = Integer.parseInt(str);
		br.close();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

	public void forTest10() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public void forTest10sbu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();

		int n = Integer.parseInt(str);

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				sb.append(" ");
			}
			for (int k = 1; k <= i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	public void forTest10b() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				bw.write(" ");
			}
			for (int k = 1; k <= i; k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();

	}

	public void forTest11() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = { 1, 10, 4, 9, 2, 3, 8, 5, 7, 6 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] < x) {
				System.out.println(a[i] + " ");
			}
		}

	}

	public void forTest11_1() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (a[i] < x) {
				System.out.print(a[i] + " ");
			}
		}

	}

	public void forTest11_2() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a < x) {
				System.out.print(a + " ");
			}

		}

	}

	public void forTest11sbu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백역할로 객체생성.

		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()); // 엔터역할.

		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine()); // 엔터역할.

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken()); // 공백으로 만들어진 'st.'

			if (a < x)
				sb.append(a).append(" ");
		}
		System.out.println(sb);
	}

}
