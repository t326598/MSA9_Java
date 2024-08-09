package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1357test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	//i : 1 ~ 2a-1
	for (int i = 1; i <=2*a-1; i++) {
		if(i <=a) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
							}
			System.out.println();
		}
		else {
			//for(int j = 1; j <= 2*a-i; j++){
			for (int k = a-(i-a); k >= 1; k--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
}
}
