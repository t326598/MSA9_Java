package Day13.Ex03_WildCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in); // 입력
	static List<Course<?>> courseList = new ArrayList<Course<?>>(); // 과정 목록
	static List<Person> studentList = new ArrayList<Person>(); // 원생 목록

	public static void main(String[] args) {
		int no = 0;
		do {
			menu(); // 메뉴 출력
			no = sc.nextInt(); // 메뉴 번호 입력
			sc.nextLine(); // 엔터 제고
			System.out.println(); // 한 줄 개행

			switch (no) {
			// 과정 등록
			case 1:
				courseList.add(createCourse());
				break;
			// 수강생 등록
			case 2:
				addStudent();
				break;
			// 과정 확인
			case 3:
				printCourseList();
				break;
			// 수강생 확인
			case 4:
				printStudent();
				break;

			default:
				System.out.println("유효한 메뉴 번호를 입력해주세요.");
				break;
			}
		} while (no != 0);
	}

	/*
	 * 메뉴 출력
	 */
	public static void menu() {
		System.out.println(":::::::수강생 등록 프로그램:::::::::");
		System.out.println("1. 과정 등록");
		System.out.println("2. 수강생 등록");
		System.out.println("3. 과정 확인");
		System.out.println("4. 수강생 확인");
		System.out.println("5. 종료하기");
		System.out.println(":::::::::::::::::::");
		System.out.println("번호 : ");
	}

	/*
	 * 과정 등록
	 * 
	 * @return
	 */
	public static Course<?> createCourse() {
		System.out.println(" - 과정 종류 (일반인, 직장인, 학생) : ");
		String type = sc.nextLine();
		System.out.println("- 과정 명 :");
		String name = sc.nextLine();

		Course<?> course = switch (type) {
		case "일반인" -> {
			Course<Person> newCouse = new Course<Person>();
			yield newCouse.createCourse(name, newCouse);
		}
		case "직장인" -> {
			Course<Person> newCouse = new Course<Person>();
			yield newCouse.createWorkerCourse(name, newCouse);
		}
		case "학생" -> {
			Course<Student> newCouse = new Course<Student>();
			yield newCouse.createStudentCourse(name, newCouse);
		}

		default -> throw new IllegalArgumentException("유효하지 않은 과정 종류 : " + type);

		};

		return course;
	}

	/*
	 * 과정 확인
	 */
	public static void printCourseList() {
		System.out.println("::::::::과정목록::::::::");
		for (Course<?> course : courseList) {
			System.out.println(course);
		}
		System.out.println("::::::::::::::::::::::");
	}

	/*
	 * 수강생 등록
	 */
	public static void addStudent() {
		System.out.println(" - 과정 종류(일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String courseType = sc.nextLine();
		System.out.println(" - 수강생 종류(일반인, 직장인, 학생, 중학생, 고등학생) : ");
		String type = sc.nextLine();
		System.out.println("- 수강생 이름 : ");
		String name = sc.nextLine();
		System.out.println("- 등록할 과정 명 : ");
		String courseName = sc.nextLine();

		Course<?> selectedCourse = new Course();
		// 해당 수강생을 등록할 과정을 지정
		for (int i = 0; i < courseList.size(); i++) {
			Course<?> course = courseList.get(i);
			// 입력한 과정명과 등록된 과정명이 일치하면

			if (course.getName().equals(courseName)) {
				selectedCourse = course; // 지정된 과정
				break;
			}
		}
		// 선택된 과정에서 수강생 목록을 가져온다.

		// (List<Person>) selectedCourse.getStudents();
		// 수강생 목록에 지금 입력한 수강생을 추가한다.
		// * 수강생 종류에 맞게 객체를 생성하여 추가한다.
		Person student = switch (courseType) {
		case "일반인" -> {
			Course<Person> course = (Course<Person>) selectedCourse;
			List<Person> students = course.getStudents();
			Person newStudents = new Person(name);
			students.add(new Person(name));
			yield new Person(name);
		}
		case "직장인" -> {
			if(type.equals("학생") || type.equals("고등학생") || type.equals("중학생")) {
				System.out.println("학생은 직장인 과정을 들을 수 없습니다.");
				yield null;
			}
			else {
			Course<Worker> course = (Course<Worker>) selectedCourse;
			List<Worker> students = course.getStudents();
			Person newStudents = new Worker(name);
			students.add(new Worker(name));
			yield new Worker(name);
			}}
		
		case "학생" -> 
		{Course<Student> course = (Course<Student>) selectedCourse;
		List<Student> students = course.getStudents();
		Person newStudents = new Student(name);
		students.add(new Student(name));
		yield new Student(name);
}
		case "고등학생" ->{Course<Student> course = (Course<Student>) selectedCourse;
		List<Student> students = course.getStudents();
		Person newStudents = new Student(name);
		students.add(new Student(name));
		yield new Student(name);
}
		case "중학생" -> {Course<Student> course = (Course<Student>) selectedCourse;
		List<Student> students = course.getStudents();
		Person newStudents = new Student(name);
		students.add(new Student(name));
		yield new Student(name);
}
		default -> throw new IllegalArgumentException("유효하지 않은 수강생 종류입니다 : " + type);
		};
		studentList.add(student);
	}

	/**
	 * 수강생 확인
	 */
	public static void printStudent() {
		System.out.println("::::수강생::::");
		System.out.println("수강생 이름 : ");
		String name = sc.nextLine();

		boolean check = false; // 등록 여부 확인
		for (int i = 0; i < studentList.size(); i++) {
			Person person = studentList.get(i);
			if (person.getName().equals(name)) {
				System.out.println("* 등록된 수강생입니다. : " + name);
				check = true; // 등록 O
				break;
			}
		}
		// check : false 그대로 남아있는 경우 - 등록 X
		if (!check) {
			System.out.println("* 등록되지 않은 이름입니다.");
			return; // 메소드 종료 : 아래 코드는 실행되지 않음
		}
		// 등록된 수강생인 경우 수강 중인 과정을 출력
		System.out.println(":::::::수강 중인 과정::::::::");
		for (int i = 0; i < courseList.size(); i++) {
			// 해당 과정의 수강생 목록
			List<Person> students = (List<Person>) courseList.get(i).getStudents();

			// 해당 과정의 과정명 호출
			String courseName = courseList.get(i).getName();
			// 해당 과정의 수강생 목록을 확인하여, 입력한 이름과 일치하는 경우가 있으면
			// 해당 수강생이 수강하는 과정으로 출력한다.
			for (int j = 0; j < students.size(); j++) {
				if (students.get(j).getName().equals(name)) {
					System.out.println("- " + courseName);
				}
			}
		}
		System.out.println("::::::::::::::");
	}
}