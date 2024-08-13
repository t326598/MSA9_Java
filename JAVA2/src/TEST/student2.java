package TEST;

public class student2 {
public static void main(String[] args) {
	student ST = new student();
		
		do {
			int menuNo = menu();
			if( menuNo == 0 ) break;
			
			switch (menuNo) {
				case 1:
						input();
						break;
				case 2:
						listAll();
						break;
				case 3:
						classList();
						break;
				case 4:
						subjectList();
						break;
				case 5:
						searchStudent();
						break;
				default:
						break;
			}
			
		} while (true);
		
		System.out.println("프로그램 종료.");
		
	}

private static void searchStudent() {
	// TODO Auto-generated method stub
	
}

private static void subjectList() {
	// TODO Auto-generated method stub
	
}

private static void classList() {
	// TODO Auto-generated method stub
	
}

private static void input() {
	// TODO Auto-generated method stub
	
}

private static void listAll() {
	// TODO Auto-generated method stub
	
}

private static int menu() {
	// TODO Auto-generated method stub
	return 0;
}
}
}
