package TEST;

import java.util.Scanner;


public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3,잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택 >");
			int d = sc.nextInt();
			
			switch (d) {
			case 1: System.out.print("예금액 > ");
					a = sc.nextInt();
					break;
			case 2: System.out.println("출금액 >");
					b = sc.nextInt();
					break;
					
			case 3:   balance = a - b;
				System.out.println("잔고 >" + balance);	
					break;
					
			case 4: run = false;	
					
		}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

}
