package api.util.collections;

import java.util.Comparator;

public class NameAscCompareImpl implements Comparator<GradeVO>{

	// �̸����� �������� ����
	// ��,��,��,... A,B,C,...
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return first.getName().compareTo(second.getName());
	}
	/*
	 * �ڿ� �Ķ���Ϳ� �ִ� �ձ��ڿ� ���ؼ� �ձ��ڰ� ���������� ���ڶ�� 
	 * �� ���ں��� �����϶�.
	 */

}
