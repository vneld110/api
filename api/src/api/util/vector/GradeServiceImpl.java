package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService{

	Vector<GradeVO> grades = new Vector<GradeVO>();
	
	@Override
	public void input(GradeVO vo) {
		
	}
										
	@Override
	public void print() {
		// 성적표를 출력하는 메소드
		// vo.toString()으로 처리 예상하고 있음.
		GradeVO vo = new GradeVO();
		System.out.println(vo.toString());
		
	}

	@Override
	public String searchGradeByHak(String hak) {
		// 학번으로 검색하는 기능을 가진 메소드
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				
			}else{
				result = "일치하는 학번이 없습니다.";
			}
		}
		 
		return result;
	}

	@Override
	public Vector<String> searchGradeByName(String name) {
		// 이름으로 성적을 검색해서 출력하는 메소드
		// 이름은 중복 가능성 있기때문에 Vector<String>타입
		Vector<String> vc = new Vector<String>();
		// 벡터나 기타 컬렉션 출력을 하게되면
		// 이터레이터나 확장for문으로 처리한다.
		// 확장 for문은 인덱스를 따지지 않기 때문.
		
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 파라미터로 넘어온 이름과 동일한 vo객체를 찾아서
				 String 형태로 벡터에 저장한다.
				 즉 vc는 String 타입이란 것에 주의! GradeVO타입이 아님.
				 */
				vc.add(vo.toString());
			}
		}
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
