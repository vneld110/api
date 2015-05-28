package api.util.vector;

import java.util.Vector;

/*
 java.util.Vector
 add() : 벡터에 값을 할당하는 기능.
 */
public class AddDemo {
	public static void main(String[] args) {
		String id = "admin";
		int age = 27; // 나이
		Boolean male = true; // 성별
		
		Vector<String> vec = new Vector<String>();// <String> 생략시 모든 object.
		String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("리터럴 문자로 생성된 객체");
		// vec.add(2) >> int 형은 에러발생.
		
		/* *주의*
		 벡터는 length() 사용하지 않고 size()로 요소의 수를 표현한다.
		 for loop 출력시 배열은 get(arr[i])
		 벡터는 elementAt(i).
		*/
		for(int i=0; i<vec.size(); i++){
			System.out.println("벡터의 "+i+"번째 요소는 "+vec.elementAt(i));
		}
		/*
		 출력 : 
		 벡터의 0번째 요소는 admin
		 벡터의 1번째 요소는 23     >> 숫자 아님.String 리터럴
		 벡터의 2번째 요소는 false  >> boolean 타입 아님. String
		 벡터의 3번째 요소는 리터럴 문자로 생성된 객체  >> 리터럴 객체 사용 가능.
		 */
	}
}
