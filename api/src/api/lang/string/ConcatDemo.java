package api.lang.string;
/*
 java.lang.String Ŭ������ ���� �޼ҵ� ��
 concat() : �ΰ��� ���ڿ��� ��ģ��.
 */
public class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = "API�н���..";
		String str3 = str1+str2;
		// + ������ ���
		System.out.println("+������ �����"+str3);
		
		// concat() �޼ҵ� ��� > �Ķ���ͷ� (������ ������ ����)> ���� �� ȭ��.
		String str4 = "concat()���� : ��ο�,";
		System.out.println(str4.concat("�ڹٿ���.."));
	}
}
