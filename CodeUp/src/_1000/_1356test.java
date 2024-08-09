package _1000;

import java.util.Scanner;

public class _1356test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for (int d = 1; d <= a; d++) {
		// 첫번째 줄, 마지막 줄, 모든 열 *
		if(d==1||d==a) {
		for (int i = 1; i <= a; i++) {
			System.out.print("*");
		}
		
		}
		//나머지 (2~(a-1)번 줄, 첫번째와 마지막 열만 *
		else {
			//*첫번째 열
			System.out.print("*");
			//*빈칸 출력
			for (int j = 1; j <= a-2; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}
		System.out.println();
	}
 }
}
