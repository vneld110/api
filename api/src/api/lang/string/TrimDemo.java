package api.lang.string;
/*
 java.lang.String
 trim() : ���ڿ� �յ� ������ �����Ѵ�.
 ���ڿ� ������ ������ �������� �ʴ´�.
 */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "    Hello Java World !!   ";
		System.out.println("trim()���� :"+str.trim()+"~");
		// ��� : trim()���� :Hello Java World !!~
		String str2 = "    Hello Java World !!    ";
		System.out.println("�޼��� ü������ ����:"+str2.trim().replace("Java", "JSP")+"~");
		// ��� : �޼��� ü������ ����:Hello JSP World !!~
		
		/*
		 trim()ó�� �����ϴ� ���� String Ÿ���̸�
		 String �� �޼ҵ带 �����ؼ� ����� �� �ִµ� 
		 �̰��� �޼ҵ� ü���̶�� �ϸ�
		 ���� StringŬ������ ���� �޼ҵ带 �����Ҷ�
		 ���������� trim()�� ������Ѽ� �����Ѵ�.
		 */
		System.out.println("trim()������� ������� : "+"    Hello Java".indexOf("J"));
		System.out.println("trim()����� ��� : "+"    Hello Java".trim().indexOf("J"));
		
	}
}
