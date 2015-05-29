package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteraterDemo {
	public static void main(String[] args) {
		/* 
		 ArrayList list = new ArrayList();
		 �� ������ Ʋ���� ������
		 �÷��� Ÿ�Ե��� �������̽� Ÿ������ �����Ѵ�.
		 
		 List �� import �� �� ��������
		 ��Ŭ���� ������ java.awt.List �����ϸ� �ȵǰ�
		 util ��Ű���� �����ؾ��Ѵ�.
		 
		 ���׸� Ÿ���� ���� ������ Ÿ�� ����� ��� �޽����� ���.
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
