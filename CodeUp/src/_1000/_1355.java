package _1000;

import java.util.Scanner;

public class _1355 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int j = 1; j <= a; j++) {
	for (int i = a; i >= j; i--) {
		System.out.print("*");	
	
	}
	System.out.println();
	
	for (int k = 1; k <= j ; k++) {
		System.out.print(" ");
		
	}
	
		}
		
}
}
