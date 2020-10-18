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
	
	public void divBu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 
		 double a = Double.parseDouble(st.nextToken());
		 double b = Double.parseDouble(st.nextToken());
		 
		 System.out.println(a/b);
		 
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
		int b = Integer.parseInt(st.nextToken());

		sb.append(a + b).append("\n").append(a - b).append("\n").append(a * b).append("\n").append(a / b).append("\n")
				.append(a % b);

		System.out.println(sb);
	}

	// 10430
	public void remain() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

	public void remainBu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

	public void remainSpt() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);

		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}

	/*
	 * StringTokenizer < Split 실행속도 빠르기
	 */

	public void remainSb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		sb.append((a + b) % c).append("\n");
		sb.append((a % c + b % c) % c).append("\n");
		sb.append((a * b) % c).append("\n");
		sb.append((a % c * b % c) % c);

		System.out.println(sb);
	}

	public void remainBw() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		bw.write(((a + b) % c) + "\n");
		bw.write(((a % c + b % c) % c) + "\n");
		bw.write(((a * b) % c) + "\n");
		bw.write(((a % c * b % c) % c) + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	//2588
	public void mul3() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
	
	public void mul3Sb() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		sb.append(a*(b%10)).append("\n");
		sb.append(a*((b%100)/10)).append("\n");
		sb.append(a*(b/100)).append("\n");
		sb.append(a*b);
		
		System.out.println(sb);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end
