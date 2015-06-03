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
		 * Map�� ���� �Է��ϴ� ��� >> 1������ ����.
		 */
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�ٸ���", new Integer(66));
		map.put("��Ʈ�� �ڹ�", new Integer(10));
		
		/*
		 * GoF �� ������ �����߿���
		 * Iterator �����̶�� �Ҹ����
		 * Map���� ���� �����ϴ� ����ȭ�� �����̴�.
		 */
		/*
		 * �ʿ��� Ű���� �������� ���� ��Ȳ�� ���� ����Ҷ��� 
		 * : entrySet()
		 * �ʿ��� Ű���� ����� ��� : keySet()
		  
		 * �÷��ǿ��� �������̽��� Set, List, Map  �� ��ǥ���ε�
		 * Set �� Map �� �ε��� ���̾��� ȣȯ�� �ߵǰ�
		 * Set�� �ߺ��� ���� ����� �־ Map ���� Ű���� �ߺ��� ������� �ʴ� �Ͱ�
		 * ���� �ƶ�����.. Set�� ���� Ű�� Ȥ�� Ű-�������� ����ϴµ� ���δ�.
		 * ���� Iterator�� ��� Set�� Iterator �� ����Ѵ�.
		 */
		/*
		 * Map���� ���� ����ϴ� ���� 3����
		 * 1. Ű+���� ����   >> entrySet()+Iterator ���� ���
		 */
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("������ : "+ e.getKey()+", ���� : "+e.getValue());
		}
		/*
		 * Map���� ���� ����ϴ� ���� 3����
		 * 2. Ű ����   >> keySet() ���
		 */
		set = map.keySet();
		System.out.println("������ ��� : "+ set);
		/*
		 * Map���� ���� ����ϴ� ���� 3����
		 * 3. ���� ����   >> Collection ���
		 */
		// Collection ���� ��Ŭ���� ������ java.util.collection����
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()){
			Integer i = (Integer) it.next();
			total += i.intValue();
		}
		System.out.println("���� : "+total);
		// Set �� List �迭�� Ŭ����ó�� ����� ������ size()�� �Ѵ�.
		System.out.println("��� : "+total/set.size());
		System.out.println("�ִ밪 : "+Collections.max(values));
		System.out.println("�ּҰ� : "+Collections.min(values));
	}
}
