package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		GradeVO vo2 = new GradeVO();
		GradeVO vo3 = new GradeVO();
		vo1.setHak("1001");
		vo1.setName("ȫ�浿");
		vo1.setKor(60);
		vo1.setEng(50);
		vo1.setMath(40);
		
		vo2.setHak("1002");
		vo2.setName("ȫ�浿");
		vo2.setKor(75);
		vo2.setEng(70);
		vo2.setMath(65);
		
		vo3.setHak("1003");
		vo3.setName("��浿");
		vo3.setKor(90);
		vo3.setEng(85);
		vo3.setMath(80);

		GradeService service = new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);
		System.out.println("1001�й��� ���� : "+service.searchGradeByHak("1011"));
		// �÷��� ������ <Ŭ����Ÿ��>�� ���׸��̶�� Ī��
		// Ư���� ����� ���ϴ� ���� �ƴϰ�
		// �÷��� ���ο��� Ÿ�� ĳ������ �Ѵٰ� �����ϸ� ��.
		Vector<String> vc = service.searchGradeByName("ȫ�浿");
		for(int i=0; i<vc.size(); i++){
			System.out.println(""+vc.elementAt(i));
		}
	}
}
