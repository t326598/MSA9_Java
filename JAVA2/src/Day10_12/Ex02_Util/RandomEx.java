package Day10_12.Ex02_Util;

import java.util.Random;

public class RandomEx {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		// 동전 던지기
		boolean randomTF = random.nextBoolean();
		System.out.println("동전 앞뒤 : " + randomTF);
		
		System.out.println("동전 던지기");
		if(randomTF) System.out.println("앞면");
		else System.out.println("뒷면");
		
		//정수형 랜덤 수
		int fourByteRandom = random.nextInt();
		System.out.println("fourByteRandom : " + fourByteRandom);
		
		// random.nextInt(N) : (0~N-1) 사이의 임의 정수를 반환
		// random.nextInt(6) : (0~5)
		// random.nextInt(6) +1 : (1~6)
		// [공식] random.nextInt(개수) + 시작숫자 : 사이의 랜덤정수 출력 가능
		//주사위 던지기
		int dice = random.nextInt(6) + 1;
		System.out.println("주사위 : " + dice);
		
		//로또
		int lotto = random.nextInt(45)+1;
		System.out.println("로또번호 : " + lotto);
		
		//실수형 랜덤 수
		double randomDouble = random.nextDouble();
		System.out.println("tlftngud foseja tn : " + randomDouble);
	}
}
