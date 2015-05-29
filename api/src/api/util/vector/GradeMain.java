package api.util.vector;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		GradeVO vo2 = new GradeVO();
		GradeVO vo3 = new GradeVO();
		vo1.setHak("1001");
		vo1.setName("홍길동");
		vo1.setKor(60);
		vo1.setEng(50);
		vo1.setMath(40);
		
		vo2.setHak("1002");
		vo2.setName("홍길동");
		vo2.setKor(75);
		vo2.setEng(70);
		vo2.setMath(65);
		
		vo3.setHak("1003");
		vo3.setName("김길동");
		vo3.setKor(90);
		vo3.setEng(85);
		vo3.setMath(80);

		GradeService service = new GradeServiceImpl();
		service.input(vo1);
		service.input(vo2);
		service.input(vo3);
		System.out.println("1001학번의 성적 : "+service.searchGradeByHak("1011"));
		// 컬렉션 내부의 <클래스타입>을 제네릭이라고 칭함
		// 특별한 기능을 말하는 것은 아니고
		// 컬렉션 내부에서 타입 캐스팅을 한다고 생각하면 됨.
		Vector<String> vc = service.searchGradeByName("홍길동");
		for(int i=0; i<vc.size(); i++){
			System.out.println(""+vc.elementAt(i));
		}
	}
}
