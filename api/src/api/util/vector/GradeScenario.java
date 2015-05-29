package api.util.vector;

public class GradeScenario {
/*
 성적표 벡터로 작성하기 코딩 시나리오
 1. VO, Interface 클래스 다이어그램을 받아든다. 본인이 작성했건 받았건.
	일단 본인이 작성하지 않아서 잘 모르는 상황이라는 설정.
	혹은 본인이 하더라도 짐작가는대로 설정한 기능이라는 가정 하에.
 2. VO getter,setter ..implement 를 일단 구현한다.
 3. 기능중에 total 구하는 기능 필요함
    total은 과목점수가 필요하므로 VO 내부에 total 구하는 기능 넣는다.
 4. VO일단 완성했다고 보고 *Impl로 간다.
 5. *Impl()을 보면서 메소드를 분석해본다.
 	그리고 주석을 자신의 방식대로 적어둔다.
	input()		 		// 학생별로 성적을 입력 받는 것인가.. 
	 					   입력받으면 저장할 공간이 필요함
			 			   배열이 다중 변수를 저장해야하는데 추가로 늘려야 하니까
			 			   동적으로 확장하는 컬렉션을 선택해야겠군. 벡터에 넣어야지.
		 			   
    print() 			// 출력하는 것인가? 그럼 vo객체의 toString()을 가져와야지.
    
    searchGradeByHak()  // 학번으로 성적을 조회하는 기능이군
    		   		   	   학번은 오직 한 학생에게만 존재하므로 리턴값이 String일테니
    					   벡터의 for loop 내부에 if를 해봐야겠다.
    					   
    searchGradeByName() // 이름으로 성적조회인데 리턴값이 벡터인것을 보니
    					   복수 개의 String 을 처리하게끔 설계되었군.
    					   리턴값이 하나든 여러개든 for loop + if 구성으로 
    					   벡터요소 출력 로직 써야겠다.
    					   
    descGradeTotal() 	// 내림차순인가보다. Collections.sort 쓰면 된다는데 배우면써야지
    
    ascGradeTotal()	    // 오름차순이면 Arrays.sort를 쓰면되겠군
    
    메소드마다 공유하는 다수의 값(학생이 여러명) 이 필요한데,
    한 군데에 저장할 컬렉션을 필드에 선언해야겠다.
    필드에 선언해야 메소드들이 값을 공유할 수 있으니까.
    
 6. 대충 만들었으니 한번 돌려봐야겠다. 더미값 한 두개 만들어야지
    setter 여러개 쓰기 귀찮으니까 샘플은 생성자로 한번에 만들어야겠다.
 
 */
}
