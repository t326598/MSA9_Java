package Day03;

import java.util.Scanner;

public class Ex01_if {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		//입력 받은 값이 홀수 인지, 짝수인지 조건문으로 판단
		// if 조건문 * if(조건식) {}
		if (num%2 == 0) {
			System.out.println("짝수 입니다.");
		}
		if (num % 2 == 1) {
			System.out.println("홀수 입니다.");
		}
		
		sc.close();
	}


}
