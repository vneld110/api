package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2011","홍길동",90,80,70);
		GradeVO g2 = new GradeVO("2012","김길동",80,88,70);
		GradeVO g3 = new GradeVO("2013","장길동",50,73,70);
		GradeVO g4 = new GradeVO("2014","문길동",95,50,70);
		
		grades.add(g1);
		grades.add(g2);
		grades.add(g3);
		grades.add(g4);
		
		// anonymous 생성자 처리 : 한 번만 쓰고 버림.
		// grades.add(new GradeVO("2015","홍길동",85,55,68));
		
		System.out.println("이름 오름차순 정렬");
		Collections.sort(grades, new NameAscCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
		System.out.println("이름 내림차순 정렬");
		Collections.sort(grades, new NameDescCompareImpl());
		for(GradeVO grade : grades){
			System.out.println(grade);
		}
	    System.out.println("총점 오름차순 정렬");
	    Collections.sort(grades, new TotalAscCompareImpl());
	    for(GradeVO grade : grades){
	    	System.out.println(grade);
	    }
	    System.out.println("총점 내림차순 정렬");
	    Collections.sort(grades, new TotalDescCompareImpl());
	    for(GradeVO grade : grades){
	    	System.out.println(grade);
	    }
	}
}
