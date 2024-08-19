package Javac;

import java.util.Scanner;

public class bank {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	account AC = new account();
	String name = " ";
	int a= sc.nextInt();
	do {
		System.out.println("===================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("0. 종료");
		System.out.println("===================");
		System.out.print("입력 >>> ");
		int b = sc.nextInt();
		if(b == 0) break;
		// break: 제어문을 탈출하는 키워드 * 가장 가까운 제어문만 탈출한다.
		
		// 메뉴 번호 입력
		// 메뉴 선택}

		switch (b) {
		case 1:
				System.out.print("계좌번호 >>");
				String c = sc.next();
				System.out.print(" >>");
				String c = sc.next();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
			break;
		}
}
}
