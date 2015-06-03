package api.util.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * Map에 값을 입력하는 경우 >> 1가지만 존재.
		 */
		map.put("김연아", new Integer(98));
		map.put("아사다마오", new Integer(66));
		map.put("소트니 코바", new Integer(10));
		
		/*
		 * GoF 와 디자인 패턴중에서
		 * Iterator 패턴이라고 불리우는
		 * Map에서 값을 추출하는 정규화된 패턴이다.
		 */
		/*
		 * 맵에서 키값과 벨류값의 맵핑 현황을 전부 출력할때는 
		 * : entrySet()
		 * 맵에서 키값만 출력할 경우 : keySet()
		  
		 * 컬렉션에서 인터페이스는 Set, List, Map  이 대표적인데
		 * Set 과 Map 은 인덱스 값이없어 호환이 잘되고
		 * Set은 중복값 제거 기능이 있어서 Map 에서 키값의 중복을 허용하지 않는 것과
		 * 같은 맥락으로.. Set을 통해 키값 혹은 키-벨류값을 출력하는데 쓰인다.
		 * 맵은 Iterator가 없어서 Set의 Iterator 를 사용한다.
		 */
		/*
		 * Map에서 값을 출력하는 경우는 3가지
		 * 1. 키+벨류 형태   >> entrySet()+Iterator 패턴 사용
		 */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("참가자 : "+ e.getKey()+", 점수 : "+e.getValue());
		}
		/*
		 * Map에서 값을 출력하는 경우는 3가지
		 * 2. 키 형태   >> keySet() 사용
		 */
		set = map.keySet();
		System.out.println("참가자 명단 : "+ set);
		/*
		 * Map에서 값을 출력하는 경우는 3가지
		 * 3. 벨류 형태   >> Collection 사용
		 */
		// Collection 에서 이클립스 제안은 java.util.collection선택
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("총점 : "+total);
		// Set 도 List 계열의 클래스처럼 요소의 개수를 size()로 한다.
		System.out.println("평균 : "+total/set.size());
		System.out.println("최대값 : "+Collections.max(values));
		System.out.println("최소값 : "+Collections.min(values));
	}
}
