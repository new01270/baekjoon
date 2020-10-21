package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ForTestRe {

	public void forRe() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}

	// 10950
	public void forRe2() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}

	public void forRe2bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a + b);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	// 8393
	public void forRe3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void forRe3bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	// 15552
	public void forRe4() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	// 2741
	public void forRe5() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public void forRe5bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

	// 2742
	public void forRe6() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}

	public void forRe6bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());

		for (int i = n; i > 0; i--) {
			sb.append(i).append('\n');
		}
		System.out.println(sb);
	}

	// 11021
	public void forRe7() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Case #" + i + ": " + (a + b));

		}

	}

	// 11022
	public void forRe8() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int x = 1; x <= t; x++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println("Case #" + x + ": " + a + " + " + b + " = " + (a + b));

		}
	}

	public void forRe9() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

	public void forRe9bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	// 2439
	public void forRe10() {
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

	public void forRe10Bu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

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
	
	//10871
	public void forRe11() {
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end
