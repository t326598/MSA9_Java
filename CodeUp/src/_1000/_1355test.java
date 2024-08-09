package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1355test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int i = 1; i <= a; i++) {
		//빈칸
		for (int k = 1; k < i; k++) {
			System.out.print(" ");
			
		}
		//*
		for (int j = a; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}
}
