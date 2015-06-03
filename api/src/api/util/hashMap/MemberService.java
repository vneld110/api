package api.util.hashMap;

public interface MemberService {
	// 회원가입 기능
	public void join(String id, String password, String name, int age, String addr);
	// 회원가입 후 로그인 기능
	public void login(String id, String password);
}
