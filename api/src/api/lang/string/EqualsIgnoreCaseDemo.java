package api.lang.string;
/*
  equalsIgnoreCase() : 비교대상의 대소문자 구별 안함
 */
public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		System.out.println(
				"Hello".equals("hello")?"같다":"다르다");
		System.out.println(
				"Hello".equalsIgnoreCase("hello")?"같음":"다름");
	}
}
