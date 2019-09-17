package recursion;

import java.util.Scanner;

public class Fact {
	// 재귀함수를 이용한 팩토리얼 구현
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();

		System.out.println(input + "! = " + factorial(input));
		sc.close();
	}

	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}
