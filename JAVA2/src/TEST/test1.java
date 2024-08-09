package TEST;

import java.util.Scanner;

public class test1 {
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
