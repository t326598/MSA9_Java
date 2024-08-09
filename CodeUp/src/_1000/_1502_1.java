package _1000;

import java.util.Scanner;

public class _1502_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int k = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			// i : 0, j : 0,1,2 
			for (int j = 0; j < N; j++) {
				System.out.print(arr[j][i] +" ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}
}
