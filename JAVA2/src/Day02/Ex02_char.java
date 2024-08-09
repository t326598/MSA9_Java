package Day02;

public class Ex02_char {
public static void main(String[] args) {
	// 문자 자료형		: char
	//리터럴(Literal)	: 소스코드에서 표기하는 데이터( 숫자, 문자, 문자열인지 의미를 부여)
	// - 문자 리터럴	: 'A'로 표현해줘야함
	// - 문자열 리터럴	: "A"로 표현해줘야함
	// - 정수 리터럴 	: 100
	// - 실수 리터럴 	: 12.34f, 12.3456D
	char c1 = 'A';		// 문자 리터럴
	char c2 =  65;		// 십진수 --> 아스키코드표 매핑된 문자
	char c3 = '\u0041';	// 유니코드
	char c4 = '가';
	char c5 = 44032;
	char c6 = '\uac00';
	
	int unicode = c1;
	// char를 int로 변환한 값이 unicode가되어 번호로 출력
	System.out.println("c1 : " + c1);
	System.out.println("c2 : " + c2);
	System.out.println("c3 : " + c3);
	System.out.println("c4 : " + c4);
	System.out.println("c5 : " + c5);
	System.out.println("c6 : " + c6);
	System.out.println("A의 코드값 : " + unicode);
    char B = (char)(c2 + 1);
    System.out.println("B : " + B);
    System.out.println("B의 코드값 :" + (int)B);
	// c2 (char) + 1(int)
	// 자바에서 정수는 기본적으로 (int)형으로 취급한다.
	// 연산은 기본적으로 같은 자료형끼리 가능하다.
	// 작은 자료형과 큰 자료형을 연산하면 그 결과는 큰 자료형이된다.
    // (c2 + 1) : (char) + (int) = int로 자동 형 변환
    // 그래서 강제 형변환이 필요해 B = (char) (c2 + 1) : (char) = (char) (int) 강제 형 변환
	
			// 다중커서: alt + 마우스 클릭 / 해제는 esc
}
}   
