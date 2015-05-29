package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// setter ��� ����� �������� �����ڷ� �ѹ��� ��������~
		GradeVO g1 = new GradeVO("ȫ�浿", "1111", 70, 80, 90);
		GradeVO g2 = new GradeVO("��浿", "2222", 60, 85, 70);
		GradeVO g3 = new GradeVO("��浿", "3333", 75, 95, 50);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		/* ��� : 
		 * ����ǥ [�й�=, �̸�=, ����=0, ����=0, ����=0]
		 * ���Ϳ� �ִ� grade �� �����;���. > vc.toString()
		 */
		
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("��浿");
		System.out.println(temp.toString());
		
		

	}
}
