package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1==p2)?"p1와 p2는 같은 사람":"p1와 p2는 다른 사람";
		System.out.println("p1==p2 에 대한 결과값은:"+result);
		
		result = (p1.equals(p2))?"p1와 p2는 같은 사람":"p1와 p2는 다른 사람";
		System.out.println("p1.equals(p2) 에 대한 결과값은:"+result);
	}
}
class Person{
	private String ssn; //주민번호
	public Person(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//alt + shift +s >> generate hashcode() and equals()

	@Override
	public boolean equals(Object obj) {
		/*
		 Object 는 모든 데이터 타입을 의미하기 때문에
		 반드시 주민번호를 갖고있는 Person인지 확인해야
		 주민번호 일치여부를 확인할 수 있으므로
		 객체캐스팅 연산자 instanceof를 사용한다.
		 이런 기능을 Validation 유효성체크라고 한다.
		 */
		if(obj!=null&&obj instanceof Person){
			return ssn == ((Person)obj).ssn;
			//java.lang.Object의 객체캐스팅은
			//((객체타입)obj).~ 의 형태로 이뤄진다.
		}else{
			return false;
		}
	}
	
}
