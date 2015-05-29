package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 java.util.ArrayList
 add() : Vector의 add()메소드와 동일.
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 벡터는 내부적으로 String 사용.
		 속도 느리고, 동기화 지원한다.
		 ArrayList는 내부적으로 StringBuffer를 사용한다.
		 동기화 지원 안함.
		 */
		ArrayList<String> lists = new ArrayList<String>();
		// 항목 추가
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		// 출력1. iterator() 이용 - 많이 사용
		
		Iterator<String> it1 = lists.iterator();
		while (it1.hasNext()) {
			// printf 사용한다.
			System.out.printf("%s", it1.next());
			// 위 예문에서 %s 는 String 타입을 의미.
		}
		System.out.println();
		// 출력2. listIterator() 이용
		ListIterator<String> it2 = lists.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s", it2.next());
			// 다운 캐스팅 필요없다. String 이 됨.
		}
		System.out.println();
		// 출력3. previous() 이용
		while (it2.hasPrevious()) {
			// 메소드 명이 바뀐 부분 체크!
			System.out.printf("%s",it2.previous());
			// 
		}
		// 전체 요소를 한 번에 입력
		// List 인터페이스는 java.util .
		List<String> list2 = new ArrayList<String>();
		// 인터페이스<제너릭> 참조변수 = new 구현한객체<제너릭>();
		list2.addAll(lists); // 서울 부산 대구 복사해서 넣음
		// 출력4. 확장 for 문
		// 컬렉션은 인덱스에 대한 조건이 주어지지않는 출력형태가 많기 때문에
		// 확장 for 문을 즐겨 사용한다.
		for(String s : lists){
			System.out.printf("%s", s);
		}
		System.out.println();
		
		//검색 명력을 위한 데이터 추가 (더미값 추가..)
		list2.add("광주");
		list2.add("인천");
		list2.add("대전");
		// 출력5. 검색해서 출력
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			str = it3.next();
			if(str.startsWith("대")){
				// 대로 시작하는 문자열 검색
				System.out.printf("%s",str);
			
			}
		}
		System.out.println();
		// 동일한 자료 입력 가능.. 중복값 허용함
		list2.add("인천");
		list2.add("인천");
		list2.add("인천");
		
		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s", it4.next());
			// 참고로 printf에서 10진수 숫자값은 %d(decimal)
		}
		System.out.println();
	}
}
