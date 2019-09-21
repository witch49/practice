package sum;

import java.math.BigInteger;

public class Sum {
	public static void main(String[] args) {
		sum();
		mutiply();
	}

	// 1에서 100까지 더하기
	public static void sum() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
 
	// 1에서 100까지 곱하기 (100! 구하기)
	public static void mutiply() {
		BigInteger big = new BigInteger("1"); // 답을 담을 변수를 1로 초기화
		for (int i = 1; i <= 100; i++)
			big = big.multiply(BigInteger.valueOf(i));
		System.out.println(big); // 답 출력
	}
}
