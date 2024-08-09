package test123;

import java.util.Iterator;

public class test1234 {
	// plus, minus, multiple, divide, reamin, sum, avg
	
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	public int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	public double multiple(double x, double y) {
		double result = x * y;
		return result;
	}
	
	public double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	
	public double reamin(double x, double y) {
		double result = x % y;
		return result;
	}
	
	public double sum(double [] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
		sum += arr[i];
	}
		return sum;
		}
	public double avg(double [] arr) {
		sum(arr);
		double avg = 0;
		return avg = (double) sum(arr) / arr.length;
	}
	
	
}
