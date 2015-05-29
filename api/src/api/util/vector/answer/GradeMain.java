package api.util.vector.answer;

import java.util.Vector;

public class GradeMain {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		// setter 모두 만들기 귀찮으니 생성자로 한번에 만들어야지~
		GradeVO g1 = new GradeVO("홍길동", "1111", 70, 80, 90);
		GradeVO g2 = new GradeVO("김길동", "2222", 60, 85, 70);
		GradeVO g3 = new GradeVO("김길동", "3333", 75, 95, 50);
		service.input(g1);
		service.input(g2);
		service.input(g3);
		service.print();
		/* 출력 : 
		 * 성적표 [학번=, 이름=, 국어=0, 영어=0, 수학=0]
		 * 벡터에 있는 grade 를 가져와야함. > vc.toString()
		 */
		
		String dummy = service.searchGradeByHak("1111");
		System.out.println(dummy);
		
		Vector<String> temp = new Vector<String>();
		temp = service.searchGradeByName("김길동");
		System.out.println(temp.toString());
		
		

	}
}
