package Day03;

public class Ex09_WhilesSum {
public static void main(String[] args) {
	int a = 1;
			int sum = 0;
			while (a <= 1000){
				//방법 1
				//sum = sum + a;
				//a++;
				//방법2
				//sum = sum + a++;
			    //방법3
				sum += a++;
			}
			System.out.println(" 합계 : " + sum);
}
}
