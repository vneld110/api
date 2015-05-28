package api.lang.string;
/*
 java.lang.String
 replace("old":"new) : String ���ڿ����� "old"���ڸ� "new"���ڷ� ��ü�Ѵ�.
 ���� ��ü�ϴ� ���ڰ� �����̸� replaceAll()�� ����Ѵ�. 
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		// ���ڸ� ��ȯ�Ͽ� ���
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		// �ݺ��Ǵ� ���ڸ� ��ȯ�Ͽ� ���
		System.out.println("A B C D : A B C D".replaceAll("C D", "E F"));
		
		/*
		 �� ������ �ڹ� ���� 5(JDK1.5)������ �����Դϴ�.
		 ���� 5 ���� replace()����� Ȯ��Ǿ� replaceAll()��
		 ������ ���ڿ��� �����ϰ� �Ǿ����ϴ�.
		 �׷��ٸ� ��������,
		 ���ԽĿ� ���� ����� �ִ��� ������ �����Դϴ�.
		 */
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		
		System.out.println("[3] Hello Java !!?!!".replace("!", ""));
		System.out.println("[4] Hello Java 111!!!".replaceAll(".!", ""));
		/*
		 .�� ������ ���ԽĿ��� ���̴µ� �Ǿ� �� ���ڸ� �����մϴ�.
		 ����ǥ�� �ΰ��ִµ� �տ� �ϳ��� �����
		 �� ����� replaceAll()���� �ֽ��ϴ�.
		 ���� replace()���ٴ� ���Խı��� ó�� ������ replaceAll()�� �����
		 �����մϴ�.
		 (java script���� ���� �����
		 */
		/*
		 replaceAll(".!","") : !�� !�� ���ڸ�(.)�� ���� ""�� ��ü. 
		 */
	}
}
