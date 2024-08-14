package Day07.Review;

import java.util.Iterator;

public class Ex04_Lotto {

	public static void main(String[] args) {
		// Math.random() : 0.xxxxx ~ 0.9xxxx 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);

		// 1 ~ 사이의 정수: 주사위

		System.out.println((int) (Math.random() * 10) + 1);
		// (int (Math.random() * 10) + 1 : 1 ~ 10
		int dice = (int) (Math.random() * 6) + 1;
		// (int)(Math.random() * 6) : 0 ~ 5
		// (int) (Math.random()

		System.out.println("주사위 :" + dice);
		// 1 ~ 20 사이의 랜덤수
		System.out.println((int) (Math.random() * 20) + 1);
		// -20 ~ 20 사이의 랜덤수
		System.out.println((int) (Math.random() * 41) - 20);

		// 1 ~ 45 사이의 랜덤수
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);

			for (int j = i-1; j >= 0; j--) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
