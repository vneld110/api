package api.lang.string;
/*
 java.lang.String 클래스에 속한 메소드 중
 concat() : 두개의 문자열을 합친다.
 */
public class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "API학습중..";
		String str3 = str1+str2;
		// + 연산자 사용
		System.out.println("+연산자 사용결과"+str3);
		
		// concat() 메소드 사용 > 파라미터로 (본래값 변하지 않음)> 가입 후 화면.
		String str4 = "concat()사용시 : 헬로우,";
		System.out.println(str4.concat("자바월드.."));
	}
}
