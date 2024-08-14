package Javac;

import java.util.Scanner;

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	account AC = new account();
	String name = " ";
	int a= sc.nextInt();
	do{
		System.out.println("===================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("0. 종료");
		System.out.println("===================");
		System.out.print("입력 >>> ");
		int num = sc.nextInt();
		if(num == 0) break;
		// break: 제어문을 탈출하는 키워드 * 가장 가까운 제어문만 탈출한다.
		String arr[][]= new String [9999-9999][9999];
		
		/*
		 * 1.계좌등록
		 * 	1-1 계좌번호 String a, 비밀번호 int b 예금명 String c, 예금액 int d 입력
		 * 	1-2 arr[a][b] = b와 d를 입력
		 * 	1-3 arr[a][b][c] = d입력
		 * 	 
		 */
		
		
		switch (num) {
		case 1:
				System.out.print("계좌번호 >>");
				int b = sc.nextInt();
				System.out.print("비밀번호 >> ");
					int c = sc.nextInt();
				System.out.println("예금액 >>");
				int d = sc.nextInt(); 
			arr[b][c] = ("계좌번호" + b + "예금액" + c);
					
				
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
		
		}while(num != 0);
	}
	
}
