package api.lang.string;
/*
  equalsIgnoreCase() : �񱳴���� ��ҹ��� ���� ����
 */
public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello".equals("hello")?"����":"�ٸ���");
		System.out.println(
				"Hello".equalsIgnoreCase("hello")?"����":"�ٸ�");
	}
}
