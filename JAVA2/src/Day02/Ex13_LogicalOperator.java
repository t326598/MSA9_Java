package Day02;

public class Ex13_LogicalOperator {
	public static void main(String[] args) {
		// 논리 연산자
		// - && (AND) : A, B 둘 다 true일때 결과가 true
		// - || (OR)  : A, B 둘 중 하나가 ture 이면 결과가 true
		
		//AND
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && true);
	System.out.println(false && false);
	System.out.println();
		//OR
	System.out.println(true ||  true);
	System.out.println(true || false);
	System.out.println(false || true);
	System.out.println(false || false);
	System.out.println();
	// NOT
	// !A : A가 true 이면 false, false이면 true로 변환
	System.out.println(!true);
	System.out.println(!false);
	System.out.println();
	
	// 쇼트서킷
	// : 논리 연산에서 결과를 미리 알아서, 남은 논리식을 실행하지 않는 것
	int value1 = 3;
	System.out.println(false && ++value1 > 10);
	System.out.println("valuse1 : " + value1);
	
	int value2 = 3;
	System.out.println(true || ++value2 > 10);
	System.out.println("value2 : " + value2);
	// 비트 연산자의 경우 쇼트 서킷이 적용되지 않는다.
	int value3 = 3;
	System.out.println(false & ++value3 > 10);
	System.out.println("value3 : " + value3);
	
	int value4 = 3;
	System.out.println(true | ++value4 > 10);
	System.out.println("value4 : " + value4);
	
	}
}
