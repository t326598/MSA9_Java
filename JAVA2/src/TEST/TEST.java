package TEST;


public class TEST {
	int a = 10;
	int b = 20;
	
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	public static void main(String[] args) {
		
		TEST test = new TEST();
		int answer = sum(test.a, test.b);
				System.out.print("a +b =");
		System.out.println(answer);

	}

}
