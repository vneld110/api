package api.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 java.util.ArrayList
 add() : Vector�� add()�޼ҵ�� ����.
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 ���ʹ� ���������� String ���.
		 �ӵ� ������, ����ȭ �����Ѵ�.
		 ArrayList�� ���������� StringBuffer�� ����Ѵ�.
		 ����ȭ ���� ����.
		 */
		ArrayList<String> lists = new ArrayList<String>();
		// �׸� �߰�
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		// ���1. iterator() �̿� - ���� ���
		
		Iterator<String> it1 = lists.iterator();
		while (it1.hasNext()) {
			// printf ����Ѵ�.
			System.out.printf("%s", it1.next());
			// �� �������� %s �� String Ÿ���� �ǹ�.
		}
		System.out.println();
		// ���2. listIterator() �̿�
		ListIterator<String> it2 = lists.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s", it2.next());
			// �ٿ� ĳ���� �ʿ����. String �� ��.
		}
		System.out.println();
		// ���3. previous() �̿�
		while (it2.hasPrevious()) {
			// �޼ҵ� ���� �ٲ� �κ� üũ!
			System.out.printf("%s",it2.previous());
			// 
		}
		// ��ü ��Ҹ� �� ���� �Է�
		// List �������̽��� java.util .
		List<String> list2 = new ArrayList<String>();
		// �������̽�<���ʸ�> �������� = new �����Ѱ�ü<���ʸ�>();
		list2.addAll(lists); // ���� �λ� �뱸 �����ؼ� ����
		// ���4. Ȯ�� for ��
		// �÷����� �ε����� ���� ������ �־������ʴ� ������°� ���� ������
		// Ȯ�� for ���� ��� ����Ѵ�.
		for(String s : lists){
			System.out.printf("%s", s);
		}
		System.out.println();
		
		//�˻� ����� ���� ������ �߰� (���̰� �߰�..)
		list2.add("����");
		list2.add("��õ");
		list2.add("����");
		// ���5. �˻��ؼ� ���
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			str = it3.next();
			if(str.startsWith("��")){
				// ��� �����ϴ� ���ڿ� �˻�
				System.out.printf("%s",str);
			
			}
		}
		System.out.println();
		// ������ �ڷ� �Է� ����.. �ߺ��� �����
		list2.add("��õ");
		list2.add("��õ");
		list2.add("��õ");
		
		Iterator<String> it4 = list2.iterator();
		while (it4.hasNext()) {
			System.out.printf("%s", it4.next());
			// ����� printf���� 10���� ���ڰ��� %d(decimal)
		}
		System.out.println();
	}
}
