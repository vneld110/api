package api.util.hashSet;

import java.util.HashSet;
import java.util.Set;

/*
 java.util.HashSet
 add() : ����� �߰����.(���Ϳ� ����)
 */
/*
 Set�� ��ü�� �߰��� �� HashSet�� �̹� �ִ� ��ü���
 �ߺ����� �����ϰ� �������� �ʴ´�
 �׸��� false�� �����Ѵ�.
 
 - Set �� ū �ָӴ��� ����. �ߺ� ���� ����.
 - List �� ���� size ���� ��Ҹ� �߰��� ��, ������ size��ŭ�� �ø���.
 - List �� ��ҿ��� �ߺ� ��Ҹ� �����ϰ� ���� ����, Set �ָӴϿ� List ��Ҹ�
   �Է��� �� �ٽ� ��ȯ�Ѵ�.
 - Map �� ��Ҹ� �߰��� �� put()�� ����ϰ�, �ڷḦ ������ �˻��ϴ� ����� Ưȭ��.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2","3","3","3","4"};
		// ��Ŭ���� ���� �� java.util.Set/HashSet �߰�
		Set set = new HashSet();
		for(int i=0; i<arr.length; i++){
			set.add(arr[i]);
		}
		System.out.println("���� ��� ��� : "+set);
		/*
		 ��� :
		 ���� ��� ��� : [3, 2, 2, 1, 4]
		 > new Integer(2) �� "2"�� ���� �ٸ� ��ü �̹Ƿ� �ߺ����� �������� ����.
		 Set �������̽��� ������ ������� ����.
		 */
		
	}
}
