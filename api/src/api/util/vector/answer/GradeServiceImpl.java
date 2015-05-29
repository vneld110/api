package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*
	 메소드마다 공유하는 다수의 값(학생이 여러명) 이 필요한데,
    한 군데에 저장할 컬렉션을 필드에 선언해야겠다.
    필드에 선언해야 메소드들이 값을 공유할 수 있으니까.
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>();
									// GradeVO 의 getter 리턴 타입을 모두 포함.
	GradeVO grade = new GradeVO();
	
	/*
	 input()
	 학생별로 성적을 입력 받는 것인가.. 
	 입력받으면 저장할 공간이 필요함
	 배열이 다중 변수를 저장해야하는데 추가로 늘려야 하니까
	 동적으로 확장하는 컬렉션을 선택해야겠군. 벡터에 넣어야지.
	 */
	@Override
	public void input(GradeVO vo) {
		vc.add(vo);
	}
	/*
	 print()
	 출력하는 것인가? 그럼 vo객체의 toString()을 가져와야지.
	 */
	@Override
	public void print() {
		System.out.println(vc.toString());
		
	}
	/*
	 searchGradeByHak()  
	 학번으로 성적을 조회하는 기능이군
     학번은 오직 한 학생에게만 존재하므로 리턴값이 String일테니
     벡터의 for loop 내부에 if를 해봐야겠다.
	 */
	@Override
	public String searchGradeByHak(String hak) {
		String msg = ""; // 지역변수 초기화, if로직에서 메시지 출력.
		for(int i=0; i<vc.size(); i++){
			/*
			 myHak 은 벡터에서 i번째 요소의 학번을 리턴하여 담은 변수.
			 String 타입이다.
			 */
			String myHak = vc.elementAt(i).getHak();
		    /*	
		     파라미터로 받아온 hak 과 벡터에서 리턴받은 myHak이
			 일치하는 지 여부를 체크하는 로직.
		     */
			if(hak.equalsIgnoreCase(myHak)){
				msg = hak;
				break;
			}else{
				msg = "조회한 학번이 없습니다.";

			}
		}
		return msg;
	}
	/*
	 searchGradeByName()
	 이름으로 성적조회인데 리턴값이 벡터인것을 보니
     복수 개의 String 을 처리하게끔 설계되었군.
     리턴값이 하나든 여러개든 for loop + if 구성으로 
     벡터요소 출력 로직 써야겠다.
	 */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> local = new Vector<String>(); // 리턴타입 다르므로 생성해줌.
		for(int i=0; i<vc.size(); i++){
			/*
			 myHak 은 벡터에서 i번째 요소의 학번을 리턴하여 담은 변수.
			 String 타입이다.
			 */
			String myName = vc.elementAt(i).getName();
		    /*	
		     파라미터로 받아온 name 과 벡터에서 리턴받은 myName이
			 일치하는 지 여부를 체크하는 로직.
		     */
			if(name.equalsIgnoreCase(myName)){
				local.add(name); // 벡터에 담아줌.
			
			}else{
				local.add("");
			
			}
		}
		
		return local;
	}
	/*
	 descGradeTotal() 	
	 내림차순인가보다. Collections.sort 쓰면 된다는데 배우면써야지
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	/*
	 ascGradeTotal()	 
	 오름차순이면 Arrays.sort를 쓰면되겠군
	 */
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub
		
	}

}
