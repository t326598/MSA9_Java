package Javac;

import java.util.Scanner;

public class bank {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	account AC = new account();
	int a= sc.nextInt();
	do {
		System.out.println(":::::::메뉴판::::::");
		System.out.println("1. 참치마요 삼각김밥");
		System.out.println("2. 굶음");
		System.out.println("3. 진라면 매운맛");
		System.out.println("4. 와퍼");
		System.out.println("5. 마라탕");
		System.out.println("0. 종료");
		System.out.print("메뉴 번호 : ");
		menuNo = sc.nextInt();
		if(menuNo == 0) break;
		// break: 제어문을 탈출하는 키워드 * 가장 가까운 제어문만 탈출한다.
		
		// 메뉴 번호 입력
		// 메뉴 선택}

		switch (menuNo) {
		case 1:
			menuName = " 참치마요 삼각김밥";
			break;
		case 2:
			menuName = " 굶음";
			break;
		case 3:
			menuName = " 진라면 매운맛";
			break;
		case 4:
			menuName = " 와퍼";
			break;
		case 5:
			menuName = " 마라탕";
			break;
		default:
			break;
		}
}
}
