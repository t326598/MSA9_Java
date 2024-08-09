package Day03;

import java.util.Scanner;

public class Ex03_Elseif {
public static void main(String[] args) {
	// 성적을 입력받아서, 성적에 따른 학점 A ~ F를 출력하시오.
	Scanner sc = new Scanner(System.in);
	System.out.println("성적 :");
	
	int score = sc.nextInt();
	
	char grade = 'F';
	
	if (score >= 90 && score <= 100)	grade = 'A';
	if (score >= 80 && score < 90) grade = 'B';
	if (score >= 70 && score < 80) grade = 'C';
	if (score >= 60 && score < 70) grade = 'D';	
	if (score < 60 && score >= 0){grade = 'E';
	System.out.println(grade);
	 
	
	if (score >= 90 && score <= 100) 			grade = 'A';
	else if (score >= 80) 						grade = 'B';
	else if (score >= 70)		 grade = 'C';
	else if (score >= 60 ) 		grade = 'D';	
	else  	grade = 'E';
	
	System.out.println(grade);
	
	}
	
	sc.close();
}
}