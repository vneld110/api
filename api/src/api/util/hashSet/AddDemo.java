package api.util.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
 java.util.HashSet
 add() : 요소의 추가기능.(벡터와 동일)
 */
/*
 Set은 객체를 추가할 때 HashSet에 이미 있는 객체라면
 중복으로 간주하고 저장하지 않는다
 그리고 false를 리턴한다.
 
 - Set 은 큰 주머니의 형태. 중복 제거 가능.
 - List 는 기존 size 에서 요소를 추가할 때, 기존의 size만큼을 늘린다.
 - List 의 요소에서 중복 요소를 제거하고 싶을 때는, Set 주머니에 List 요소를
   입력한 후 다시 반환한다.
 - Map 은 요소를 추가할 때 put()을 사용하고, 자료를 빠르게 검색하는 기능이 특화됨.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2","3","3","3","4"};
		// 이클립스 제안 중 java.util.Set/HashSet 추가
		Set set = new HashSet();
		for(int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("저장 요소 출력 : "+set);
		/*
		 출력 :
		 저장 요소 출력 : [3, 2, 2, 1, 4]
		 > new Integer(2) 와 "2"는 서로 다른 객체 이므로 중복으로 간주하지 않음.
		 Set 인터페이스는 순서를 취급하지 않음.
		 */
		
	}
}
