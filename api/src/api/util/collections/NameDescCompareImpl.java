package api.util.collections;

import java.util.Comparator;

public class NameDescCompareImpl implements Comparator<GradeVO> {
	// �̸����� �������� ����
	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return second.getName().compareTo(first.getName());
	}

}
