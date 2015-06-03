package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{

	MemberVO vo = new MemberVO();
	Map<String, Object> map = new HashMap<String, Object>();
	/*
	 회원 가입 기능
	 HashMap 을 해야 ID 값을 가지고 password를 호출하겠구나
	 */
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		/*
		 이 패턴은 DB에 저장하는 패턴과 일치한다.
		 즉, 값을 활용하면서 오염되거나 변질될 수 있기에
		 가장 먼저 순수값을 DB에 저장하고 본다.
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		/*
		 * 첫번째 에러유형
		 * map.put(vo.getId(), vo.getPassword()
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// 키와 벨류 패턴에서 벨류값을 String 으로 통일하기위해
		// int 타입으로 들어온 age를 String 타입으로 변환.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		/*
		 * 두번째 에러유형
		 * map.put("age",vo.getAge());
		 */
		
	}

	/*
	 회원가입 후 로그인 기능을 하는 메소드 이후에 
	 로그인 성공, 실패 메시지까지. 
	 */
	@Override
	public void login(String id, String password) {
		/*
		 * 세번째 에러유형
		 * map.get(id) 파라미터는 반드시 String type
		 */
		/*
		 출력문 예시
		 입력하신 ID는 존재하지 않거나 일치하지 않습니다. 다시 입력해주세요.
		 비번이 다릅니다 다시입력하세요.   (while x)
		 환영합니다. 서울시에 사는 20세 홍길동님..
		 */
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("환영합니다."+vo.getAddr()+"에 사는 "
									+vo.getAge()+"세 "+vo.getName()+"님!");
		}else if(!(map.get("id").equals(id))){
			System.out.println("입력한 ID는 존재하지 않거나, 일치하지 않습니다."
													+ "다시 입력해주세요");
		}else{
			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
		}
		
		
	}

}
