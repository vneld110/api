package api.util.vector;

import java.util.Vector;

/*
 java.util.Vector
 add() : ���Ϳ� ���� �Ҵ��ϴ� ���.
 */
public class AddDemo {
	public static void main(String[] args) {
		String id = "admin";
		int age = 27; // ����
		Boolean male = true; // ����
		
		Vector<String> vec = new Vector<String>();// <String> ������ ��� object.
		String tom = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		// vec.add(2) >> int ���� �����߻�.
		
		/* *����*
		 ���ʹ� length() ������� �ʰ� size()�� ����� ���� ǥ���Ѵ�.
		 for loop ��½� �迭�� get(arr[i])
		 ���ʹ� elementAt(i).
		*/
		for(int i=0; i<vec.size(); i++){
			System.out.println("������ "+i+"��° ��Ҵ� "+vec.elementAt(i));
		}
		/*
		 ��� : 
		 ������ 0��° ��Ҵ� admin
		 ������ 1��° ��Ҵ� 23     >> ���� �ƴ�.String ���ͷ�
		 ������ 2��° ��Ҵ� false  >> boolean Ÿ�� �ƴ�. String
		 ������ 3��° ��Ҵ� ���ͷ� ���ڷ� ������ ��ü  >> ���ͷ� ��ü ��� ����.
		 */
	}
}
