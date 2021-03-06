package api.lang.object;
/*
 java.lang.Object 클래스의 메소드 중
 equals() : 값이 같은지 여부를 체크
 equals는 인스턴스 변수의 해시코드 값(힙주소값)을 비교하는 메소드이다.
 */
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		// result 가 지역변수이기 때문에 반드시!!!초기화!!!!!
		String result = "";
		// if(){}else{}
/*		if(t1.equals(t2)){
			System.out.println("t1과 t2의 값이 같다.");
		}else{
			System.out.println("t1과 t2의 값이 다르다.");
		}*/
		/*
		 삼항연산자는 if-else를 대체하는 구문.
		 구성은
		 (조건식)?(참인경우):(거짓인경우);
		 */
		result = (t1.equals(t2))?"t1과 t2의 값이 같다.":"t1과 t2의 값이 다르다.";
		System.out.println("생성자를 통해 생성된 참조변수 갑의 비교\n"+result);
		
		t2 = t1;
		result = t1.equals(t2) ?"t1과 t2의 값이 같다.":"t1과 t2의 값이 다르다.";
		System.out.println("참조변수 사이의 할당된 연산 이후 값의 비교\n"+result);
	
	}
}
class Temp{
	int num; // 필드에 있는 인스턴스 변수는 초기화가 필요 없다.
	public Temp(int num) {
		this.num = num;
		/*
		 상기 형태는 힙에 저장된 인스턴스 변수에
		 콜 스택에 있는 num 지역변수에 할당된 값을
		 인스턴스 변수에 넘겨주고 지역변수 자신은 사라짐.
		 */
	}
}
