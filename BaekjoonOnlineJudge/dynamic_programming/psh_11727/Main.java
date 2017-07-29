package psh_11727;

import java.util.Scanner;
/**
 * 2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // 2 x N
		
		int d[] = new int[n+2];
		d[1] = 1;
		d[2] = 3;

		for (int i = 3; i <= n; i++) {
			d[i] = (d[i-1] + 2*d[i-2]) % 10007;
		}
		
		System.out.println(d[n]);
	}
}
