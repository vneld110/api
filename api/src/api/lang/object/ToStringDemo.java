package api.lang.object;
// import java.lang.Object; 선언하지 않아도 디폴트로 import 되었음.
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade",7);
		Card card2 = new Card("heart",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		/*
		 java.lang.Object의 toString은 해시코드(객체주소값)을 
		 리턴하므로, toString()을 오버라이딩해서 원하는 결과를 얻도록 한다.
		 */
	}
}
// 한 java 파일에 두개 이상의 클래스가 있어도 되나
// 반드시 public은 하나여야 한다.
class Card{
	String kind;
	int number;
	public Card() {
		this("",0);
	}
	// 생성자 overloading을 쉽게하는 방법
	// default 생성자를 ctrl+spacebar 생성시킨후
	// 생성자 호출 예약어인 this(파라미터 개수와 타입을 코딩);하면 자동생성
	
	// 또한 디폴트 생성자를 호출하더라도 파라미터가 있는 생성자까지 호출되므로
	//생성자 파라미터 내용까지 알 필요없이 코딩 간편해진다.
	public Card(String kind, int i) {
		this.kind = kind;
		this.number = i;
	}
	// getter setter는 필요시만 만든다.

	
	// ctrl + space bar 에서 toString 만들면 하드코딩량 늘어난다
	// alt +shift +s > generate toString
	
	@Override
	public String toString() {
		return "카드 [무늬=" + kind + ", 숫자=" + number + "]";
	}
	
}
