package Day07.Review;

import java.util.Scanner;

public class ex화폐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매비");
		int input = sc.nextInt();
		int money[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		int i = 0;
		
		while(i <= 9) {
			int count = input /money[i];
			System.out.println(money[i] +"\t\t: " + count + "개");
			input = input % money[i];
			i++;
		}
		int a = sc.nextInt();
		System.out.println(a);
				
	}
}
