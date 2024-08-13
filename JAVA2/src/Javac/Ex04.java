package Javac;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 1;
		int arr[][] = new int [a][a];
		
		for (int i = 0; i < a; i++) {
			if(i%2 == 0) for (int j = 0; j < a; j++) {
				arr[i][j] = b++;
				
			}
			else if(i%2 == 1) 
				for (int j = a -1 ; j >= 0; j--) {
					arr[i][j] = b++;
				}
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();	}
	}
}
