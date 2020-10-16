package co.syeon.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	/*
	* �˰����� ������ �� �ð����⵵�� Ư�� �޼ҵ�, ������ �� �پ��� �伺���� ����Ͽ� �ּ��� �ð����⵵�� ã�ƺ��� ���� �߿�.
	* ��� ���ϴ� ��� �ð����⵵�� O(N)
	* �迭�� ����ϸ� �־��� ��� �ð����⵵�� O(N^2) 
	*/
	
	public void ArrayTest1() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		/*
		 * int N = sc.nextInt(); 
		 * int[] arr = new int[N];
		 * Arrays.sort() : �迭�� ����� ���� ���� ������������ �������ִ� �޼ҵ�.
		 */
		 
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n - 1]);
	}
}
