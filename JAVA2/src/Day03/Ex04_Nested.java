package Day03;

import java.util.Scanner;

public class Ex04_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정보처리기사 합격기준
		// 4학년 이면서 60점 이상
		System.out.println("학년 : ");
		int year = sc.nextInt();
		
		System.out.println("점수 :");
		int score = sc.nextInt();
		
		if(year == 4 && score >= 60) {
	
				System.out.println("합격");
				
		}
		else if (year < 4)
		System.out.println("응시자격이 없습니다.");
		else
			System.out.println("불합격!");
		
		if( year != 4)
			System.out.println("응시자격이 없습니다.");
		else if (score >= 60)
			System.out.println("합격");
		else 	
			System.out.println("불합격");
		
		
		sc.close();
	}

}
