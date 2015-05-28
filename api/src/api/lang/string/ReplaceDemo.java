package api.lang.string;
/*
 java.lang.String
 replace("old":"new) : String 문자열에서 "old"글자를 "new"글자로 대체한다.
 만약 대체하는 글자가 복수이면 replaceAll()을 사용한다. 
 */
public class ReplaceDemo {
	public static void main(String[] args) {
		// 글자를 변환하여 출력
		System.out.println("Hello Tom".replace("Tom", "Alex"));
		// 반복되는 글자를 변환하여 출력
		System.out.println("A B C D : A B C D".replaceAll("C D", "E F"));
		
		/*
		 위 문법은 자바 버전 5(JDK1.5)까지의 문법입니다.
		 버전 5 이후 replace()기능이 확대되어 replaceAll()로
		 복수의 글자에도 반응하게 되었습니다.
		 그렇다면 차이점은,
		 정규식에 대한 기능이 있는지 없는지 여부입니다.
		 */
		System.out.println("[1] A B C D : A B C D".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D".replaceAll("C D", "E F"));
		
		System.out.println("[3] Hello Java !!?!!".replace("!", ""));
		System.out.println("[4] Hello Java 111!!!".replaceAll(".!", ""));
		/*
		 .의 역할은 정규식에서 쓰이는데 맨앞 한 글자만 지정합니다.
		 느낌표가 두개있는데 앞에 하나만 남기고
		 이 기능은 replaceAll()에만 있습니다.
		 따라서 replace()보다는 정규식까지 처리 가능한 replaceAll()을 쓰라고
		 권장합니다.
		 (java script에서 많이 사용함
		 */
		/*
		 replaceAll(".!","") : !와 !앞 한자리(.)를 뒤의 ""로 대체. 
		 */
	}
}
