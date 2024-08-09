package Day03;

public class Ex12_For {
public static void main(String[] args) {
	// for (1. 초기식; 2.  조건식; 4. 증감식) {3. 실행문}
	// -실행 순서 : 1 => 반복 (2 > 3 > 4)
	
	// 1. 1~10까지 정수를 출력하시오.
	for (int a = 1; a <= 10; a++) {
		System.out.print(a + " ");
	}
	System.out.println();
	for (int i = 50; i <= 100; i++) {
		System.out.print(i + " ");
		if((i+1)%10 ==0) 
			System.out.println();
	}
		System.out.println(" ");
	for (int i = 2; i <= 20; i = i + 2) {
		System.out.print(i + " ");
			}
		System.out.println(" ");
	for (int c = 1; c<=20; c +=2) {
		System.out.print(c +" ");
	
		}
	}
	

}
