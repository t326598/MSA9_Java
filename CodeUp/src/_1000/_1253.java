package _1000;

import java.util.Iterator;
import java.util.Scanner;

public class _1253 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if ( a > b ) {
			int temp = a;
			a = b;
			 b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
			
		}
	/*if(a > b) {
		for (int i = b; i <= a; i++) 
			System.out.println(i);
		}
		
	
	else if (b > a) {
			for (int j = a; j <= b; j++) {
				System.out.print(j + " ");
			}
	}
			else { 
				System.out.print(b+" ");*/
			}
	//temp = a; //임시보관함
	// a=b ;
	// b = temp;
	
	
	}

