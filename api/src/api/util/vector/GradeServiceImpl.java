package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	Vector<GradeVO> grades = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		
	}
										
	@Override
	public void print() {
		// ����ǥ�� ����ϴ� �޼ҵ�
		// vo.toString()���� ó�� �����ϰ� ����.
		GradeVO vo = new GradeVO();
		System.out.println(vo.toString());
		
	}

	@Override
	public String searchGradeByHak(String hak) {
		// �й����� �˻��ϴ� ����� ���� �޼ҵ�
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				
			}else{
				result = "��ġ�ϴ� �й��� �����ϴ�.";
			}
		}
		 
		return result;
	}

	@Override
	public Vector<String> searchGradeByName(String name) {
		// �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
		// �̸��� �ߺ� ���ɼ� �ֱ⶧���� Vector<String>Ÿ��
		Vector<String> vc = new Vector<String>();
		// ���ͳ� ��Ÿ �÷��� ����� �ϰԵǸ�
		// ���ͷ����ͳ� Ȯ��for������ ó���Ѵ�.
		// Ȯ�� for���� �ε����� ������ �ʱ� ����.
		
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 �Ķ���ͷ� �Ѿ�� �̸��� ������ vo��ü�� ã�Ƽ�
				 String ���·� ���Ϳ� �����Ѵ�.
				 �� vc�� String Ÿ���̶� �Ϳ� ����! GradeVOŸ���� �ƴ�.
				 */
				vc.add(vo.toString());
			}
		}
		return null;
	}

	@Override
	public void descGradeTotal() {
		// ���� ���� �������� �������� ����
	}

	@Override
	public void ascGradeTotal() {
		// ���� ���� �������� �������� ����
	}

}
