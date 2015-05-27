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
	}
}
