package Day10_12.Ex02_Util;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		// * new Calendar() 대신, getInstance() 메소드로 객체를 사용한다.
		Calendar now = Calendar.getInstance();  // 기본 현재 날짜/시간으로 객체를 가져온다.
		printCalendar("현재", now);
		
		// 자바 프로그래밍 마지막 수업일
		Calendar test = Calendar.getInstance();
		test.set(2024, Calendar.SEPTEMBER, 4); // 2024년 9월 4일 날짜 지정
		printCalendar("자바 마지막 수업일(연/월/일", test);
		
		// 종강일
		Calendar lastDay = Calendar.getInstance();
		lastDay.set(2025, Calendar.FEBRUARY,10 ,18, 20, 0);
		printCalendar("종강일 : ", lastDay);
		
		
		//오늘부터 종길일까지 D-Day
		// getTimeInMillis() : 날짜를 ms(밀리초) 단위까지 숫자로 반환
		// 1970년 1월 1일 0시 0분 0초 0ms 부터 현재 날짜/시간 까지 카운트란 숫자를 반환
		// 0.001초 		: 1ms
		// 60초			: 1분
		// 60분    		: 1시간
		// 24시			: 1일
		long lastT = lastDay.getTimeInMillis(); // ??? 10172 ????
		long nowT = now.getTimeInMillis();		// ??? 10000 ????
		System.out.println("last - nowT =" + (lastT - nowT));
		
		long dDay = (lastT - nowT) / (1000 * 60 * 60 *24);
		System.out.println("D-day : " + dDay + "일");
		
		// 1970년 1월 1일 ~ 오늘
		// 1970년 1월 1일 ~ 2025년 2월 10일 몇일이나 흘렀는지
		long nowD = nowT / (1000* 60 * 60 * 24);
		long lastD = lastT / (1000 * 60 * 60* 24);
				System.out.println("1970년 1월 1일 ~ 오늘: " + nowD);
				System.out.println("1970년 1월 1일 ~ 2025년 2월 10일: " + lastD);
				
				//내가 태어난 지 몇일이 되었는지 구현
				Calendar birth = Calendar.getInstance();
				birth.set(1997,Calendar.OCTOBER,2);  // 내 생일로 날짜 지정하기
				long birthT = birth.getTimeInMillis();
				long br = (birthT - nowD) / (1000 * 60 * 60 * 24) ;
				System.out.println("생후 " + br + "일이 지났습니다.");
				
				// 오늘이 종강 전인지 후인지
				if( now.before(lastDay) )  {
				System.out.println("종강 전입니다.");
				}
				else if( now.after(lastDay) ) { 
					System.out.println("종강 후입니다.");
				}
				
				if(lastDay.equals(lastDay)) {
					System.out.println("종강입니다 집에 가세요.");
				}
				}
	
	
	// 날짜/시간 정보(Calendar)를 출력하는 메소드
	private static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;   // 월을 0 ~ 11로 표기
		int day= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);		// 요일은 일 ~ 토요일(1~7)로가져오기 가능
		int hour = cal.get(Calendar.HOUR);					// 12시 표시
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);		// 24시 표시
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		int ampm = cal.get(Calendar.AM_PM);
		
		System.out.print(msg + " : ");
		System.out.print(year + "/" + month + "/" + day + "/ " + hour +" : " + minute + " : " + second);
		System.out.println();
		// 일요일(1) ~ 토요일(7) 
		String Day = "";
		switch(dayOfWeek) {
		case Calendar.SUNDAY: Day = "일요일"; break;
		case Calendar.MONDAY: Day = "월요일"; break;
		case Calendar.TUESDAY: Day = "화요일"; break;
		case Calendar.WEDNESDAY: Day = "수요일"; break;
		case Calendar.THURSDAY: Day = "목요일"; break;
		case Calendar.FRIDAY: Day = "금요일"; break;
		case Calendar.SATURDAY: Day = "토요일"; break;
		}
		System.out.print(Day);
		
		System.out.print("(" + hourOfDay + "시)");
		if(ampm == Calendar.AM)
			System.out.print("오전 ");
		if(ampm == Calendar.PM) 
			System.out.print("오후");
		
			System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초 ");
			
		}
		

}
