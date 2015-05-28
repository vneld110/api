package api.util.calendar;

import java.util.Calendar;

/*
 java.util.Calendar
 */
public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1월","2월","3월","4월","5월","6월"
							,"7월","8월","9월","10월","11월","12월"};
		/*
		 Calendar.getInstance()
		 : 내부적으로 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식이다.
		 여러개의 인스턴스를 생성하지 않도록 방지하려는 목적.
		 */
		Calendar date = Calendar.getInstance();
		System.out.println("첫번째 날짜 : ");
		System.out.print(date.get(Calendar.YEAR)+"년");
		System.out.print(date.get(Calendar.MONTH)+"월");
		System.out.print(date.get(Calendar.DATE)+"일\n");
		
		
		System.out.println("시간 : ");
		System.out.print(date.get(Calendar.HOUR)+"시");
		System.out.print(date.get(Calendar.MINUTE)+"분");
		System.out.print(date.get(Calendar.SECOND)+"초\n");
		
		System.out.println("=== 1일 후 ===");
		// calendar is JANUARY which is 0
		// 현재날짜에 1 더해야 함
		date.add(Calendar.MONTH, 1);
		System.out.println(toString(date));
		/*
		 출력된 결과 값 : java.util.GregorianCalendar
		 오버라이딩 필요하다.
		 */
		System.out.println("=== 7일 전 ===");
		date.add(Calendar.DATE, -7);//현재 날짜에 7일 뺌
		System.out.println(toString(date));
		
		System.out.println("특정 시간으로 세팅");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("수정된 시간으로 출력");
		System.out.print(Calendar.HOUR+"시");
		System.out.print(Calendar.MINUTE+"분");
		System.out.print(Calendar.SECOND+"초");
		/*
		 수정된 시간 출력결과값이 101213처럼되어 오버라이딩이 필요하다.
		 */
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH)+"월"
				+date.get(Calendar.DATE)+"일";
		// 월은 0부터 시작하므로 +1 해야한다.
	}
//	public static Calendar getNowMonth(Calendar date){
//		
//	}
}
