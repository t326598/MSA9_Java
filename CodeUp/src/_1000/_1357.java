package _1000;

import java.util.Scanner;

public class _1357 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int i = 1; i <= a; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
		if(a==i) {
			for (int j = 1; j <= a; j++) {
				for (int k = a; k >= j+1; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
}
