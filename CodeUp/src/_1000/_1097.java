package _1000;

import java.util.Scanner;

public class _1097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		int arr [][]= new int[19][19];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
				System.out.print(arr[i][j] + " ");
			}System.out.println();}
		
		c = sc.nextInt();
		for (int j2 = 0; j2 < c; j2++) {
			d = sc.nextInt();
			e = sc.nextInt();	
			// de가 0 / 1일때가아니라 d w / w d일때 0일때 1일때로 구분해야함
			for (int w = 0; w < arr.length; w++) {
			if(arr[d][w] == 0 || arr[e][w] == 0 || arr[w][e] == 0 || arr[w][d] == 0) {
					arr[d][w] = 1;
					arr[w][e] = 1;
		}
			else if(arr[d][w] == 1 || arr[e][w] == 1 || arr[w][e] == 1 || arr[w][d] == 1) {
				arr[d][w] = 0;
				arr[w][e] = 0;
			}}		}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr.length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
					
				}
		
					
				}

}