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
		 index ���� �ο����� ������ ���� ù��° ��ҷ� �ڵ� �����ȴ�.
		 list.size() �� �Ķ���ͷ� �ָ� ���� �ڿ��ִ� ��ҷ� �����ȴ�.
		 listũ�⸦ �˰��ִٸ� index�� ���ڷ� ���� ���� ���������� list.size()����.
		 */
		
		System.out.println("������ ���");
		/*
		 ��Ŭ���� �������� while ���� �ڵ� ������Ű��
		 ���ǽĿ� it.hasNext()�� �����ȴ�.
		 ���� ����� ���ؼ��� hasPrevious()��� �ٲ��ش�.
		 */
		while (it.hasPrevious()) {
			System.out.print(it.previous()+"\t");
		}
		
	}
}
