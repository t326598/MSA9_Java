package Day07.Ex01_Shape;

import java.util.Scanner;

public class ShapeMaker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력변수
		double width = 0.0;
		double height = 0.0;
		double radius = 0;

		Shape[] shapeList = new Shape[3];
		int index = 0;

		while (true) {
			if (index == 3)  // 인덱스가 ~일때 멈추도록 설정
				break;
			System.out.println("1. 삼각형, 2. 사각형, 3. 원형");
			System.out.println(">>");
			String input = sc.next(); // next() : String 문자열 입력

			if (input.equals("그만"))
				break;

			// 도형 선택
			switch (input) {
			// 삼각형
			case "1":
				System.out.println("가로 : ");
				width = sc.nextDouble();
				System.out.println("세로 : ");
				height = sc.nextDouble();
				shapeList[index++] = new Triangle(width, height);
				break;

			case "2":
				System.out.println("가로 : ");
				width = sc.nextDouble();
				System.out.println("세로 : ");
				height = sc.nextDouble();
				shapeList[index++] = new Rectangle(width, height);
				break;

			case "3":
				System.out.println("반지름 : ");
				radius = sc.nextDouble();
				shapeList[index++] = new Circle(radius);
				break;
			} // - switch문 끝

		} // while 문 끝
			// 넓이 총합, 둘레 총합
		double areaSum = 0.0;
		double roundSum = 0.0;

		for (Shape shape : shapeList) {
			
			if(shape == null)
				continue;
			
			double area = shape.area();
			double round = shape.round();

			// 합계
			areaSum += area;
			roundSum += round;

			// instanceof : 인스턴스를 비교(확인)하는 연산
			// - 같은 인스턴스면 true, 아니면 false를 반환
			if (shape instanceof Triangle)
				System.out.println("삼각형");
			if (shape instanceof Rectangle)
				System.out.println("사각형");
			if (shape instanceof Circle)
				System.out.println("원형");

			System.out.println("넓이 : " + area + "\t");
			System.out.println("넓이 : " + round + "\t");
			System.out.println();
		} // foreach끝
		System.out.println("넓이 총합 : " + areaSum);
		System.out.println("둘레 총헙 : " + roundSum);
		sc.close();
	}
}
