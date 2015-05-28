package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	@Override
	public void input(GradeVO vo) {
		
	}
	
	@Override
	public void print() {
		// 성적표를 출력하는 메소드
		// vo.toString()으로 처리 예상하고 있음.
		
	}

	@Override
	public String searchGradeByHak(String hak) {
		// 학번으로 검색하는 기능을 가진 메소드
		 
		return null;
	}

	@Override
	public Vector<String> searchGradeByName(String name) {
		// 이름으로 성적을 검색해서 출력하는 메소드
		// 이름은 중복 가능성 있기때문에 Vector<String>타입
		return null;
	}

	@Override
	public void descGradeTotal() {
		// 종합 점수 기준으로 내림차순 정렬
	}

	@Override
	public void ascGradeTotal() {
		// 종합 점수 기준으로 오름차순 정렬
	}

}
