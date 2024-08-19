package Day09.Ex02_ClassCasting;

public class Person {
	
	String name;
	int age;
	
	//생성자
	public Person() {
		this("없음", 1);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public String work() {
		return "일을합니다.";
	}
	// getter, setter

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
