package Day03;

import java.util.Scanner;

public class Ex13_Gugu {
public static void main(String[] args) {
	// 구구단 ( 1 ~ 9단)
	// 원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
	// 입력: 3
	System.out.println("숫자를 입력하세요.");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for (int i = 1; i <= 9; i++) {
		System.out.println(a + "*" + i +"=" + a*i);
		
	}
	for (int b = 1; b <= 9; b++) {
		int result = b * a;
		System.out.println(a + "x" + b + "=" + result);
		
	}
}
}
