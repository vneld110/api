package api.util.hashMap;

public interface MemberService {
	// ȸ������ ���
	public void join(String id, String password, String name, int age, String addr);
	// ȸ������ �� �α��� ���
	public void login(String id, String password);
}
