package api.lang.string;
/*
 java.lang.String
 toUpperCase() : 해당 문자열을 전부 대문자로 변환
 toLowerCase() : 해당 문자열을 전부 소문자로 변환
 valueOf() : 다른 타입을 모두 문자열로 변환
 */
public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java";
		String msg;
		System.out.println("테스트용 문장:"+str);
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
	    /*
	     예제의 valueOf() 파라미터 값은 int 형이다.
		 Integer.parseInt() 하지 않고도
		 String의 스태틱 메소드인 valueOf()를 호출하면 바로 문자열로 변환된다.
		*/
		msg = String.valueOf(str.length());
		System.out.println("valueOf()결과 : "+msg);
		// 출력 : 10
	}
}
