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
	}
}
