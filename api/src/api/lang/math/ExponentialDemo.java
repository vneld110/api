package api.lang.math;
/*
 java.lang.Math
 수리영역 계산공식을 메소드화 시킨 부분
 */
public class ExponentialDemo {
	public static void main(String[] args) {
		double x = 11.635;
		double y = 2.78;
		
		/*
		 System.out.printf()
		  : C언어에서 사용하는 printf()함수를 그대로 차용한 것.
		  아래 예제는 소수점 이하 4자리까지 출력하라는 지시이다.
		 */
		System.out.printf("The value of e is %.4f%n",Math.E);
	}
}
