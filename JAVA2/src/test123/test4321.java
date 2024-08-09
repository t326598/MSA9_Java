package test123;

import java.util.Scanner;

public class test4321 {
public static void main(String[] args) {
	test1234 test4321 = new test1234();
	Scanner sc = new Scanner(System.in);
	System.out.print("a : ");
	int a = sc.nextInt();
	System.err.print("b : ");
	int b = sc.nextInt();
	
	int result1 = test4321.plus(a, b);
	System.out.println("a + b = " + result1);
	int result2 = test4321.minus(a, b);
	System.out.println("a - b = " + result2);
	
	System.out.print("x : ");
	double x = sc.nextDouble();
	System.out.print("y : ");
	double y = sc.nextDouble();
	
	double result3 = test4321.multiple(x, y);
			System.out.print("x * y = " + result3);
	// 곱셈 메소드 호출
}
}