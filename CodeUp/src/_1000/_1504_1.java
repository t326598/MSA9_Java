package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1504_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		int arr[][] = new int [a][a];
		
		for (int i = 0; i < a; i++) {
			if (i%2 == 0) {
				for (int j = 0; j < a; j++) {
					arr[i][j] = b++;
					
				}
			}
			else {
						for (int j = a - 1; j >= 0; j--) {
						arr[i][j] = b++;
					}
				}}
		for (int i = 0; i < a; i++) {
			
		
			for (int j = 0; j < a; j++) {
				System.out.print(arr[j][i]+" ");
				
			}
			System.out.println();
		}
	}

}
