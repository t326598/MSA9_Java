package _1000;

import java.util.Scanner;

public class _1501_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
