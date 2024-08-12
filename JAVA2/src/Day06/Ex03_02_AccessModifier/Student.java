package Day06.Ex03_02_AccessModifier;

import Day06.Ex03_01_AccessModifier.Person;

public class Student extends Person {

	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	public void defualtSetting() {
		name = "이름없음";	//public 접근지정자로, 모든 곳에서 접근 가능
		age = 20;		// protected 접근지정자로, Person 상속 받았기 때문에 다른 패키지라도 접근 가능하다.
		setHeight(170);	// default 접근지정자로, 같은 패키지에서만 접근가능
		setWeight(60);	// private 접근지정자로, 해당 클래스에서만 접근 가능
	}
	
	
	
	
}
