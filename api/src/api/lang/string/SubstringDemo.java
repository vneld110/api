package api.lang.string;
/*
 java.lang.String
 substring()
 ������ġ (begin)���� ����ġ(end)���� ���ڿ� ����
 begin <= x < end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		// �ε����� 0���� �����ϸ� ���鵵 1�� ó���Ѵ�.
		// 3���� ������
		System.out.println("�Ķ���Ͱ� �Ѱ��϶� :"+"Hello Java".substring(3));
		// (3�ʰ�)4���� 8����
		System.out.println("�Ķ���Ͱ� �ΰ��϶� :"+"Hello Java".substring(3,8));
	}
}
