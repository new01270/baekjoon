package co.syeon.baekjoon;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IfTest {

	// 1330
	public void ifTest() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else if (a == b)
			System.out.println("==");
	}

	public void ifTest2() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println((a > b) ? ">" : (a < b) ? "<" : "==");

	}

	// 9498
	public void ifTest3() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		if (t >= 90) {
			System.out.println("A");
		} else if (t >= 80) {
			System.out.println("B");
		} else if (t >= 70) {
			System.out.println("C");
		} else if (t >= 60) {
			System.out.println("D");
		} else
			System.out.println("F");
	}

	// swich,case
	public void ifTest3wh() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		switch (t / 10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;

		}
	}

	// 2753
	public void ifTest4() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 4 == 0 && a / 100 != 0 || a % 400 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void ifTest5() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("1");
		} else if (a < 0 && b > 0) {
			System.out.println("2");
		} else if (a < 0 && b < 0) {
			System.out.println("3");
		} else
			System.out.println("4");
	}

	public void ifTest5_2() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a > 0) {
			if (b > 0)
				System.out.println("1");
			if (b < 0)
				System.out.println("4");
		}
		if (a < 0) {
			if (b > 0)
				System.out.println("2");
			if (b < 0)
				System.out.println("3");
		}
	}

	public void ifTest6() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		if (h == 0) {
			if (m >= 45) {
				System.out.println(h + " " + (m - 45));
			} else
				System.out.println((h + 23) + " " + (m + 15));
		} else if (m >= 45) {
			System.out.println(h + " " + (m - 45));
		} else
			System.out.println((h - 1) + " " + (m + 15));
	}
}// end