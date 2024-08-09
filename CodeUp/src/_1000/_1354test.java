package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1354test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int i = 1; i <= a; i++) {
		// i : 1, j: 1,2,3,4,5
		// i : 2, j: 1,2,3,4
		// i : 3, j: 1,2,3
		// i : 4, j: 1,2,
		// i : 5, j: 1
		
		// 1 2 3 4 5 : i
		// 5 4 3 2 1 : 6 - i
		for (int j = a-i+1; j >= 1; j--) {
			//for(int j = 1; j <= (a-i+1); j--)
			//for(int j = a; j >= i; j--)
			System.out.print("*");
			
		}
		System.out.println();
		
	}
}
}
