package api.lang.string;
/*
 java.lang.String Ŭ������ ���� �޼ҵ� ��
 charAt() : ������ ��ġ�� �ִ� ���ڸ� ������. index�� 0���� ����
 indexof() : �־��� ���ڰ� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷���
 			 ������ -1��ȯ
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-1555555";
		/*
		 index �� 0���� �����ϹǷ�
		 ���ฦ �����ϴ� 1�� 7��° �ε����� ��ġ�Ѵ�.
		 */
		//char isMan = ssn.charAt(7);
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		/*
		 indexOf()�� �Ķ��ó�� �־��� String����
		 ��ġ���� �����Ѵ�. "-"�������� ���ฦ �����ϴ� ���̹Ƿ� +1.
		 */
		switch(isMan){
		case '1' :case '3': System.out.println("����"); break;
		case '2' :case '4': System.out.println("����"); break;
		default : System.out.println("�߸��� �Է°��Դϴ�."); break;
		}
	}
}
