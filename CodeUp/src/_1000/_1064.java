package _1000;

import java.util.Scanner;

public class _1064 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if (a > c && b > c) {
		System.out.println(c);}
	else if (a > b && c > b) {
	System.out.println(b);
}
	else {
		System.out.println(a);
	}
	}
}
