package co.syeon.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	/*
	* 알고리즘을 구성할 때 시간복잡도와 특정 메소드, 생성자 등 다양한 요성들을 고려하여 최선의 시간복잡도를 찾아보는 것이 중요.
	* 즉시 비교하는 경우 시간복잡도가 O(N)
	* 배열을 사용하면 최악의 경우 시간복잡도가 O(N^2) 
	*/
	
	public void ArrayTest1() {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		/*
		 * int N = sc.nextInt(); 
		 * int[] arr = new int[N];
		 */
		 
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n - 1]);
	}
}
