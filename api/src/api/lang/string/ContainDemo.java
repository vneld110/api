package api.lang.string;
/*
 java.lang.String 클래스의 메소드 중
 contains(s) : s라는 글자가 포함되었는지 여부 체크
 */
public class ContainDemo {
	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(str.contains("f")?"f포함":"f불포함");
	}
}
