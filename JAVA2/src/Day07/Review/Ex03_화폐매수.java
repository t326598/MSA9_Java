package Day07.Review;
/*
 * 더조은컴퓨터아카데미에서 김조은 팀장에게 예산을 주고
 * 에어컨을 구매하라고 지시하였다.
 * 이때 에어컨 구매비는 다음과 같이 현금으로 지급한다.
 * 구매비 		: 657825
 * 50000원		: 13개
 * 10000원		:  0개	
 * 5000원		:  1개
 * 1000원		:  2개
 * 500원			:  1개
 * 100원			:  3개
 * 50원			:  0개
 * 10원			:  2개
 * 5원			:  1개
 * 1원			:  0개
 * 위와 같이 입력하면,
 * 큰 화폐단위부터 계산하여, 화폐 단위별로 화폐매수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Ex03_화폐매수 {
	public static void main(String[] args) {
		
		// 1. 필요한 변수 선언
		// 2. 구매비 입력
		// 3. 화폐매수 계산
		//   3-1, 화폐매수 계산
		//       (화폐매수) = (입력금액) / (화폐단위)
		//   3-2, 잔액 계산
		//			657825 - (50000 * 13)
		//  		i) 잔액 = 입력금액 - 화폐단위 * 화폐매수
		//			ii)잔액 = 입력금액 % 화폐단위
		//   3-3, 화폐 단위 변환
		// 			번갈아 가면서 /5, /2 연산을 반복
		//  			(화폐단위) = (화폐단위) /5
		//				(화폐단위) = (화폐단위) /2
		// 4, 3번 과정을 반복
		Scanner sc = new Scanner(System.in);
		System.out.println("구매비 : ");
		int cash = sc.nextInt();
		int money = 50000;
		boolean sw = true;
		
		while(money >= 1) {
			int count = cash / money;
			System.out.println(money + " : " + count);
			
			cash = cash % money;
			if(sw) {
			money = money / 5;
			
		}
			else {
				money = money / 2;
			}
			sw = !sw;
		
		
		
		}}	
}
