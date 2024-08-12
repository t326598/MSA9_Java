package test123;

import java.util.Scanner;

public class test4321 {
public static void main(String[] args) {
	test1234 test4321 = new test1234();
	Scanner sc = new Scanner(System.in);
	int n = 0;
	int name;
	do {
		System.out.println(":::::::계산기::::::");
		System.out.println("1.덧셈, 뺄셈");
		System.out.println("2.곱셈, 나눗셈, 나머지 값");
		System.out.println("3.배율의 합, 배율의 평균");
		System.out.println("0. 종료");
		n = sc.nextInt();
		if(n == 1) {
			System.out.print("a : ");
			int a = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
				int result1 = test4321.plus(a, b);
				System.out.println("a + b = " + result1);
				int result2 = test4321.minus(a, b);
				System.out.println("a - b = " + result2);
					
				}
		if(n == 2) {
			System.out.print("x : ");
			double x = sc.nextDouble();
			System.out.print("y : ");
			double y = sc.nextDouble();
			
			double result3 = test4321.multiple(x, y);
					System.out.printf("x * y = %5.2f \n", result3);
					double result4 = test4321.divide(x, y);
					System.out.printf("x / y = %5.2f \n",result4);
					double result5 = test4321.reamin(x, y);
					System.out.println("x % y = " + result5);
			
		}
		if(n == 3) {
			int d = sc.nextInt();
			
			double arr[] = {15,50,100,50,60};
			
			double result6 = test4321.sum(arr);
			System.out.println(" 배열의 합 " + result6);
			double result7 = test4321.avg(arr);
			System.out.println(" 배열 평균 " + result7);
		}
	
			
	} while (n != 0);
			
	// 곱셈 메소드 호출
}
}