package _1000;

import java.util.Scanner;

public class _1442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int [a];
		
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
				arr[i] = b;
		}
		
				for (int j = 0; j < a-1; j++) {
					for (int j2 = 0; j2 < a-1; j2++) {
						if(arr[j2] > arr[j2+1]) {
							int temp = arr[j2];
							arr[j2] = arr[j2+1];
							arr[j2+1] = temp;
						}
				}}
					for (int i : arr) {
						System.out.print(i +" ");
					}
	}

}
