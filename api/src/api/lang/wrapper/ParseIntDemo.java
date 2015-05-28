package api.lang.wrapper;
/*
 JDK 1.5(�ڹٹ��� 5)���� ���Ե� ����ڽ�(autoboxing) �������
 ��ȯ���� �⺻���� ���� wrapper class �̸�
 ���� ���̰� ����.
 �׷��� parseInt() �� valueOf()�� ���̰� ����.
 
 */
public class ParseIntDemo {
	public static void main(String[] args) {
		/*
		 ���ͷ� ���� �⺻������ ĳ���� �� ��ȯ ���
		 String => int
		 */
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1+num2;
		System.out.println(result);
		// �⺻���� ���������� ����ȯ�ϴ� ��� (ĳ���� ��������)
		// Integer num3 = (Integer)result;
		Integer num3 = (Integer)result;
		System.out.println("�⺻���� ���������� ����ȯ�� ��� : "+num3);
		
		int num4 = 2+ num3;
		System.out.println("�������� �⺻���� ������ : "+num4);
		
		int num5 = Integer.parseInt("Hello");
		/*
		 num5�� java.lang.NumberFormatException : �߻�
		 ���ڰ��� ���������� ����ȯ�� �õ��ߴ��� ���θ� ����ϰ� ����� �ؾ� ��.
		 */
	}
}
