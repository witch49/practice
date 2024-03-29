package recursion;

import java.util.Scanner;

public class Recursion {
	// 재귀함수를 이용한 피보나치 수열 구현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++)
			System.out.println(fibonacci(i));

		sc.close();
	}

	public static int fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return fibonacci(n - 2) + fibonacci(n - 1);
	}
}
