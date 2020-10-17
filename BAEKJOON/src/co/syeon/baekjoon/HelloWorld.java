package co.syeon.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HelloWorld {

	public void world() {
		System.out.println("Hello World");
		System.out.println("강한육군 대한육군");

	}

	public void rabit() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

	// 1000
	public void plusScan() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);

	}

	public void plusBu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		bw.write((a + b) + "\n");

		br.close();
		bw.flush();
		bw.close();

	}

	public void plusSb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		sb.append(a + b);
		System.out.println(sb);
	}

	// 1001
	public void minusSc() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a - b);

	}

	public void minusBu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.println(a - b);

	}

	public void minusSb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		sb.append(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
		System.out.println(sb);
	}

	// 10998
	public void mul() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * b);
	}

	// 1008
	public void div() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		
//		double a = sc.nextInt();
//		double b = sc.nextInt();
//		System.out.println(a / b);
		
		System.out.println((double) a / b);
	}

	/*
	 * bufferedWriter.write(i+"\n"); bufferedWriter 는 System.out.println 처럼 자동 개행
	 * 처리가 되지 않음-> 별도 개행 처리. bufferedWriter.newLine(); 을 활용하면 개행처리가 가능하나 이건 "\n"에 비해
	 * 속도가 느림.
	 */
	// 10869
	public void operation() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	public void operationBu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		bw.write((a + b) + "\n");
		bw.write((a - b) + "\n");
		bw.write((a * b) + "\n");
		bw.write((a / b) + "\n");
		bw.write((a % b) + "\n");
		
		bw.flush();
		br.close();
		bw.close();

	}
	
	public void operationSu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b =  Integer.parseInt(st.nextToken());
		
		sb.append(a+b).append("\n").append(a-b).append("\n").append(a*b).append("\n").append(a/b).append("\n").append(a%b);
		
		System.out.println(sb);
	}

}// end
