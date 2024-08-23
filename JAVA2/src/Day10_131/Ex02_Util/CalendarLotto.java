package Day10_12.Ex02_Util;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 이번 주 로또 추첨 일시를 구해보자.
 * (조건)
 * - 매일 6시 ~ 24시까지 판매
 * - 추첨일 (토요일)에는 오후 8시에 판매 마감
 * - 추첨일 (토툐일) 오후 8시부터 다음일(일요일) 오전 6시까지 판매 정지
 * 
 * Q. 오늘 날짜/시간을 기준으로 로또를 구매한다면, 추첨일시는 언제인가?
 * (출력)
 * 추첨일: 2024 / 08 / 24 21:00:00
 * 
 */
public class CalendarLotto {
	public static void main(String[] args) {
		Calendar lottoCal = Calendar.getInstance();
		
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("월 : ");
		int 월 = sc.nextInt();
		System.out.println("일 : ");
		int 일 = sc.nextInt();
		
		lottoCal.set(Calendar.MONTH, 월-1);  // 0(1월) ~ 11(12월)
		lottoCal.set(Calendar.DAY_OF_MONTH, 일);
		
		//현재 날짜/시간의 [요일, 시간, ampm]을 추출
		int 요일 = lottoCal.get(Calendar.DAY_OF_WEEK); //일(1) ~ 토(7)
		int 시간 = lottoCal.get(Calendar.HOUR);
		int ampm = lottoCal.get(Calendar.AM_PM);  // am(0) ~ pm(1)
		
		System.out.println("요일 : " + 요일);
		System.out.println("시간 : " + 시간);
		System.out.println("ampm : " + ampm);
		System.out.println();
		// 로또 구입이 불가한 조건
		// 1. (구입불가)오전 00시 ~ 06시까지는 구입할 수 없다.
		// 2. (구입불가)토요일 이면서, 오후 8시 이후 
		// 3. (구입가능)
		boolean buyYn = false;
		if(ampm == 0 && 시간 >= 0 && 시간 <= 6) {
			System.out.println("구입 가능한 시간이 아닙니다.");
		}
		else if (요일 == 7 && ampm == 1 && 시간 >= 8) {
			System.out.println("구입 가능한 시간이 아닙니다.");
		}
		else {
			buyYn = true;
		}
			
		// 구입일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss");
		String 구입일 = sdf.format(lottoCal.getTime());
		System.out.println("구입일 : " + 구입일);
		
		
		
		
		// 추첨일 시간은 고정값 : 오후9시, 0분, 0초
		lottoCal.set(Calendar.AM_PM, 1);
		lottoCal.set(Calendar.HOUR, 9);
		lottoCal.set(Calendar.MINUTE, 0);
		lottoCal.set(Calendar.SECOND, 0);
		
		//추첨일 계산
		// 토요일 (7)과 현재 요일의 차이만큼 현재 요일에 차이를 더해준다.
		// ex)  목(5) + ( 7-5 ) = 7(토)
		// 		월(2) + ( 7-2 ) = 7(토)
		if(buyYn) {
			
		lottoCal.add(Calendar.DATE, 7-요일);
		String 추첨일 = sdf.format(lottoCal.getTime());
		
		System.out.println("추첨일 : " + 추첨일);
		}
		else {
			System.out.println("구입 가능한 시간에 다시오세요.");
		}
		
//		Calendar con = Calendar.getInstance();
//		Calendar cal = Calendar.getInstance();
//		
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH)+1;
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int hour = cal.get(Calendar.HOUR);
//		
//		
//		int day2 = Calendar.SATURDAY - cal.get(Calendar.DAY_OF_WEEK);
//		
//		con.set(Calendar.YEAR, Calendar.MONTH, (day + day2),20, 00,00);
//		cal.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_MONTH,Calendar.HOUR, Calendar.MINUTE);
//		
//		if(cal.before(con)) {
//			System.out.println("추첨일: "+ year + "/" + month + "/" + (day + day2) + " 21:00:00");
//		}
//		if(cal.after(con)) {
//			System.out.println("월요일 오전 6시까지 판매하지않습니다.");
//		}
//		
//
	}
}
