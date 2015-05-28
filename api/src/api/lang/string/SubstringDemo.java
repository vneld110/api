package api.lang.string;
/*
 java.lang.String
 substring()
 시작위치 (begin)부터 끝위치(end)범위 문자열 리턴
 begin <= x < end
 */
public class SubstringDemo {
	public static void main(String[] args) {
		// 인덱스는 0부터 시작하며 공백도 1로 처리한다.
		// 3부터 끝까지
		System.out.println("파라미터가 한개일때 :"+"Hello Java".substring(3));
		// (3초과)4부터 8까지
		System.out.println("파라미터가 두개일때 :"+"Hello Java".substring(3,8));
	}
}
