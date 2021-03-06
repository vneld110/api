package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteraterDemo {
	public static void main(String[] args) {
		/* 
		 ArrayList list = new ArrayList();
		 도 문법에 틀리진 않지만
		 컬렉션 타입들은 인터페이스 타입으로 선언한다.
		 
		 List 를 import 할 때 주의점은
		 이클립스 제안을 java.awt.List 선택하면 안되고
		 util 패키지를 선택해야한다.
		 
		 제네릭 타입을 주지 않으면 타입 경고의 노란 메시지가 뜬다.
		*/
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+"\t");
			
		}
		
		
		
	}
}
