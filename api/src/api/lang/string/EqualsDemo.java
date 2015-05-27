package api.lang.string;
/*
 java.lang.String
 == ��ü�� ���۷��� ����(hash code table)�� ���Ѱ�.
 ���ڿ��� ���� �񱳴� �ݵ�� equals()�޼ҵ带 �̿�
 new�� �̿��ϸ� heap������ ���ο� �޸𸮸� �Ҵ��ϰ�
 hashcode�� �����Ѵ�.
 */
public class EqualsDemo {
	public static void main(String[] args) {
		// String ���� ���ͷ��� ������ ���
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = (str1==str2)?"1,2����":"1,2�ٸ�";
		String result2 = (str1.equals(str2))?"1,2����":"1,2�ٸ�";
		
		System.out.println("str1==str2 : "+result1);
		System.out.println("str1.equals(str2) : "+result2);
		
		// String ���� �����ڷ� ������ ���
		String str3 = new String("abc");
		String str4 = "abc";
		
		String result3 = (str3==str4)?"3,4����":"3,4�ٸ�";
		String result4 = (str3.equals(str4))?"3,4����":"3,4�ٸ�";
		
		System.out.println("str3==str4 : "+result3);
		System.out.println("str3.equals(str4) : "+result4);
		/*
		 ��� : result3�� �ٸ�
		 >>>
		 String Ŭ������ �����ڸ� �̿��Ͽ� String�ν��Ͻ��� ������ ��쿡��
		 new �����ڿ� ���� �޸� �Ҵ��� �̷������ ������
		 �׻� ���ο� String�� �ν��Ͻ��� �����ȴ�.
		 �׷��� String Ÿ���� �����ڷ� ��ü�� �������� �ʰ� ���ͷ��� �����Ѵ�.
		 */
		/*
		 ��� Ŭ��������(*.class)���� constant pool �̶�� ������� �־, 
		 Ŭ���� ���� ���Ǵ� ��� ���ͷ��� ������� ����Ǿ��ִ�.
		 ����ϰ����ϴ� ���ڿ��� ����鿡 �̹� �����ϴ� ��쿡��
		 �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
		 */
	}
}
