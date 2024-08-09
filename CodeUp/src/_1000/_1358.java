package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1358 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int i = 1; i <= (a/2)+1; i++) {
		for (int j = 0; j < (a/2)+1-i; j++) {
			System.out.print(" ");
		}
			for (int j2 = 0; j2 < i*2 -1 ; j2++) {
				System.out.print("*");
				
			}
			System.out.println();
	
		
	}
	
}
}
