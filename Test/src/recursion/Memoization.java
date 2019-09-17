package recursion;

import java.util.Scanner;

public class Memoization {

	public static int[] table;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		table = new int[input + 1];
		System.out.println(memoFibo(input));
		sc.close();
	}

	// 메모이제이션 활용한 피보나치
	public static int memoFibo(int n) {
		if (n <= 1) {
			table[n] = 1;
			return 1;
		} 
		if (table[n] > 0)
			return table[n];

		return memoFibo(n - 1) + memoFibo(n - 2);
	}

}