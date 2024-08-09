package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1358test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	
	for (int i = 1; i <= (N+1)/2; i++) {
		for (int j = 1; j <= (N+1)/2 -i; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= 2*i-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	} 
}
}
