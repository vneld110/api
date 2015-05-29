package api.util.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it = list.listIterator(list.size());
		/*
		 ListIterator<E> listIterator(int index)
		 index 값을 부여하지 않으면 가장 첫번째 요소로 자동 지정된다.
		 list.size() 를 파라미터로 주면 가장 뒤에있는 요소로 지정된다.
		 list크기를 알고있다면 index를 숫자로 직접 지정 가능하지만 list.size()써줌.
		 */
		
		System.out.println("역방향 출력");
		/*
		 이클립스 제안으로 while 문을 자동 생성시키면
		 조건식에 it.hasNext()가 생성된다.
		 역순 출력을 위해서는 hasPrevious()라고 바꿔준다.
		 */
		while (it.hasPrevious()) {
			System.out.print(it.previous()+"\t");
		}
		
	}
}
