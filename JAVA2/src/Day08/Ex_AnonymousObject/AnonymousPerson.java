package Day08.Ex_AnonymousObject;

public class AnonymousPerson {

	
	// 익명 자식 객체 생성
	// - 부모클래스 객체명 = new 부모클래스() {익명객체 정의}
	Person person1 = new Person()	{
		
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
};

Person person2 = new Person() {
	
}


}
