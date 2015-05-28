package api.lang.string;
/*
 java.lang.String
 trim() : 문자열 앞뒤 공백을 제거한다.
 문자열 내부의 공백은 제거하지 않는다.
 */
public class TrimDemo {
	public static void main(String[] args) {
		String str = "    Hello Java World !!   ";
		System.out.println("trim()사용시 :"+str.trim()+"~");
		// 출력 : trim()사용시 :Hello Java World !!~
		String str2 = "    Hello Java World !!    ";
		System.out.println("메서드 체인으로 사용시:"+str2.trim().replace("Java", "JSP")+"~");
		// 출력 : 메서드 체인으로 사용시:Hello JSP World !!~
		
		/*
		 trim()처럼 리턴하는 값이 String 타입이면
		 String 의 메소드를 연결해서 사용할 수 있는데 
		 이것을 메소드 체인이라고 하며
		 보통 String클래스에 속한 메소드를 구현할때
		 습관적으로 trim()을 연결시켜서 진행한다.
		 */
		System.out.println("trim()사용하지 않은경우 : "+"    Hello Java".indexOf("J"));
		System.out.println("trim()사용한 경우 : "+"    Hello Java".trim().indexOf("J"));
		
	}
}
