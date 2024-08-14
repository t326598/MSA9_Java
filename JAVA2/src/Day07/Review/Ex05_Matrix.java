package Day07.Review;

import java.util.Scanner;

public class Ex05_Matrix {
	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오
		// (입력 예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		// 출력예시
		Scanner sc = new Scanner(System.in);
		System.out.print("M :");
		int a = sc.nextInt();
		System.out.print("N :");
		int b = sc.nextInt();
		int c = 1;
		int arr[][] = new int [a][b];
		
		//입력
		// 2차원 배열은 이중반복문 접근한다
		// 바깥쪽 반복문 - 반복변수 i: 행 접근
		// 안쪽 반복문  - 반복변수 j: 열 접근
		// arr.length	: - 행의 개수
		// arr[i].length : - 열의 개수
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
			}for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
			}
			System.out.println("----------------------------");
			for (int[] row : arr) {
				for (int col : row) {
					System.out.print(col + " ");
					
				}
				System.out.println();
				
			}
			
	}
}
