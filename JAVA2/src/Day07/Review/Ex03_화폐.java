package Day07.Review;

import java.util.Scanner;

public class Ex03_화폐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cash = sc.nextInt();
		System.out.println("구매비 : " + cash);
		
		int a = 50000;
	
	
		for (int i = 0; i < 5; i++) {
			
			int b = cash/a;
			int c = cash%a;
			System.out.println(a + " : " + b);
			a = a/5;
				
		int	f = c/a;
		int result = c%a;
			System.out.println(a + " : " + f);
			a= a/2;
			
			cash= result;
		
		} 
		
		sc.close();
	}

}
