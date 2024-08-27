package Day15.Ex02_Stream;

import java.util.Scanner;

public class LottoColletcionArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 게임?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("[" + (i + 1) + "게임] : ");
			int lotto[] = new int[6];

			// 랜덤 수 6개를 대입
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45 + 1);
				lotto[j] = rand;

				// 중복 제거
				for (int k = 0; k < j; k++) {
					// 현재 뽑은 랜덤 수가, 기존 수드과 같으면 다시 뽑는다.
					if (rand == lotto[k]) {
						j--;
						break;
					}

				}
			} // -- 랜덤수 6개 대입 끝

			// 정렬 - 선택 정렬
			for (int j = 0; j < lotto.length; j++) {
				for (int j2 = j + 1; j2 < lotto.length; j2++) {
					// 앞에 요소가 더 크면 교환 - swap
					if (lotto[j] > lotto[j2]) {
						int temp = lotto[j];
						lotto[j] = lotto[j2];
						lotto[j2] = temp;
					}
				}
			} // 정열끝

			// 출력
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
