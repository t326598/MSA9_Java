package Day07.Ex04_Nestedinterface;

public class Innerinterface {
	public static void main(String[] args) {
		// 중첩 인터페이스의 아우트 클래스 객체 생성
		I i = new I();
		
		// 구현 객체를 메소드를 통해 지정
		i.setInterface(new K());
		i.method();
	}

}
