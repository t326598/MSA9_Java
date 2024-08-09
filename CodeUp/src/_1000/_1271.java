package _1000;

import java.util.Scanner;

public class _1271 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= b; i++) {
			
			int a = sc.nextInt();
		if(c < a) {
			c = a;
		}
		}
		
		System.out.println(c);
	}
}
