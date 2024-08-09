package Day03;

import java.util.Scanner;

public class Ex16_Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 무한루프
		// : 반드시 종료조건을 추가해주어야한다.
		
		while (true) {
			System.out.println("입력 : ");
			String input = sc.nextLine();
			
			// 문자열은 equals("비교문자열")라는 메소드를 통해 비교가능
			// : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			
			if (input.equals("STOP")) {
				break;
			}
			System.out.println(">>" + input);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
