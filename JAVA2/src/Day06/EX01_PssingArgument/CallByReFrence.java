package Day06.EX01_PssingArgument;

import java.util.Iterator;

import Day04.Class.Pikachu;

public class CallByReFrence {

	// 배열을 전달받아서 배열 요소를 변경하는 메소드
	public static void setArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10;
		}
		System.out.println(":::::: setArr() 메소드 ::::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// 객체를 전달받아 객체의 변수를 변경하는 메소드
	public static void setObject(Pikachu pikachu) {
		pikachu.energy = 1000;
		pikachu.type = "불";
		System.out.println("::::::::setObject() 메소드 ::::::");
		System.out.println(pikachu);
		System.out.println();
	}

	public static void main(String[] args) {
		// 배열과 객체를 생성하여 메소드로 전달해보기
		int arr[] = new int[5];
		Pikachu pikachu = new Pikachu();

		// 배열에 값을 대입하기
		// arr[] : [1][2][3][4][5]
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1);
		}
		System.out.println(":::::::main() 메소드 ::::");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		// ** 래퍼런스에 의한 호출: Call By Reference
		// - 참조 자료형을 전달하는 방식
		// * 참조 자료형을 전달하면, 전달받은 메소드의 매개변수에서
		// 해당 레퍼런스로 실제 값을 접근할 수 있어서, 값 변경 시 본래의 변수의 값도 변경된다.
		setArr(arr);
		setObject(pikachu);

		System.out.println(":::::::setXXX() 메소드 호출 후 ::::");
		for (int i : arr) {
			System.out.print(i +  " ");

			// 참조자료형 arr, class 등을 불러오면 값이 아닌 정보를 불러와 저장된다
		}
		System.out.println();
		System.out.println(pikachu);
	}
}
