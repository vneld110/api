package api.lang.string;
/*
 java.lang.String
 endWith(s) : s로 끝나는지 여부 체크
 */
public class EndWithDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello.txt".endsWith("txt")?"txt파일입니다.":"txt파일이 아닙니다.");
	}
}
