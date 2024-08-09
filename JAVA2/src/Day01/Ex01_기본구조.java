package Day01;

import java.util.Scanner;

// 클래스
// public class 클래스명
// 클래스명 = 파일명 (이름이 같아야함)
// class 영역 바깥에는 코드를 작성할 수 없다
public class Ex01_기본구조 {
	// 하나의 실행문은 ;(세미콜론)으로 끝나야한다.
	// 변수 작성가능
	// 자료형 변수명;
	// 자료형 변수명 = 값;
	
	//변수 선언
	//변수 선언 및 초기화
	//; 으로 구분하여 여러 실행문을 한 줄에 작성가능
	int age = 20; int level = 99; 
	// 변수 선언
	// 값을 초기화하지 않고 선언
	int energy; // int 자료형은 값을 초기화하지 않았을 때, 기본값 0으로 세팅이된다
	// 메소드
	// 접근지정자 (static) 반환타입 메소드맹 (매개변수) {실행문;}
	// public 접근 지정자, static 생략가능
	public int sum(int x, int y) {
		System.out.println("x: " + x);
		System.out.println("y: " + y);
        int result = x + y;
        return result;
        // return(값)
        // 메소드를 종료 
        // 값을 메소드를 호출한 자리로 대입시켜줌
	}
	// main 메소드: 프로그램의 사작점
	// main 메소드는 하나의 프로그램의 하나의 메소드가 구성된다.
	// main : ctrl + space
	public static void main(String[] args) {
		// 객체 생성
		// 클래스타입 객체명 = new 클래스명();
		Ex01_기본구조 객체1 = new Ex01_기본구조();
		// 객체를 생성해야만 내부의 변수와 메소드를 접근(사용)할 수 있다.
		// (.) 접근 연산자로 객체의 변수와 메소드를 접근 및 호출할 수 있다.
		// 개체.뱐수
		// 객체.메소드()
		//기본 출력 sysout: ctrl + space
		System.out.println("나이: " + 객체1.age);
		System.out.println("에너지: " + 객체1.energy);
		System.out.println("레벨: " + 객체1.level);
		// 프로그램 실행: ctrl + F11
		
		//메소드 호출(실행)
		// 메소드명(인수1, 인수2);
		// = 인수 (인자; argument) : 메소드로 전달해줄 값
		int answer = 객체1.sum(10, 20);
		System.out.println("answer " + answer);
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number + 10);
	scan.close();
	}
	
}
