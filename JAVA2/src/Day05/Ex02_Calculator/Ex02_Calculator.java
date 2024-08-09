package Day05.Ex02_Calculator;

import java.util.Scanner;

public class Ex02_Calculator {
	public static void main(String[] args) {
		
		
		System.out.println("....계산기....");
		int n = 0;
		String e = " ";
		
		
		
		
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int number[] = {a, b};
		System.out.println("숫자 두개를 입력하세요.");
		
		System.out.println(a + " + " + b + " = " + calculator.plus(a, b) );
		System.out.println(a + " - " + b + " = " + calculator.minus(a, b) );
		System.out.println(a + " * " + b + " = " + calculator.multiple(a, b) );
		System.out.println(a + " / " + b + " = " + calculator.divide(a, b) );
		System.out.println(a + " % " + b + " = " + calculator.reamin(a, b) );
		System.out.println("모든 요소의 합 : " + calculator.sum(number));
		System.out.println("모든 요소의 평균 : " + calculator.avg(number) );
	}
}
