package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	@Override
	public void input(GradeVO vo) {
		
	}
	
	@Override
	public void print() {
		// ����ǥ�� ����ϴ� �޼ҵ�
		// vo.toString()���� ó�� �����ϰ� ����.
		
	}

	@Override
	public String searchGradeByHak(String hak) {
		// �й����� �˻��ϴ� ����� ���� �޼ҵ�
		 
		return null;
	}

	@Override
	public Vector<String> searchGradeByName(String name) {
		// �̸����� ������ �˻��ؼ� ����ϴ� �޼ҵ�
		// �̸��� �ߺ� ���ɼ� �ֱ⶧���� Vector<String>Ÿ��
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
