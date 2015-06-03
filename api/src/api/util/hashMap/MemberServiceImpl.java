package api.util.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService{

	MemberVO vo = new MemberVO();
	Map<String, Object> map = new HashMap<String, Object>();
	/*
	 ȸ�� ���� ���
	 HashMap �� �ؾ� ID ���� ������ password�� ȣ���ϰڱ���
	 */
	@Override
	public void join(String id, String password, String name, int age, String addr) {
		/*
		 �� ������ DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�.
		 ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ �� �ֱ⿡
		 ���� ���� �������� DB�� �����ϰ� ����.
		 */
		vo.setAddr(addr);
		vo.setAge(age);
		vo.setId(id);
		vo.setName(name);
		vo.setPassword(password);
		/*
		 * ù��° ��������
		 * map.put(vo.getId(), vo.getPassword()
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		// Ű�� ���� ���Ͽ��� �������� String ���� �����ϱ�����
		// int Ÿ������ ���� age�� String Ÿ������ ��ȯ.
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		/*
		 * �ι�° ��������
		 * map.put("age",vo.getAge());
		 */
		
	}

	/*
	 ȸ������ �� �α��� ����� �ϴ� �޼ҵ� ���Ŀ� 
	 �α��� ����, ���� �޽�������. 
	 */
	@Override
	public void login(String id, String password) {
		/*
		 * ����° ��������
		 * map.get(id) �Ķ���ʹ� �ݵ�� String type
		 */
		/*
		 ��¹� ����
		 �Է��Ͻ� ID�� �������� �ʰų� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.
		 ����� �ٸ��ϴ� �ٽ��Է��ϼ���.   (while x)
		 ȯ���մϴ�. ����ÿ� ��� 20�� ȫ�浿��..
		 */
		if(map.get("id").equals(id) && map.get("password").equals(password)){
			System.out.println("ȯ���մϴ�."+vo.getAddr()+"�� ��� "
									+vo.getAge()+"�� "+vo.getName()+"��!");
		}else if(!(map.get("id").equals(id))){
			System.out.println("�Է��� ID�� �������� �ʰų�, ��ġ���� �ʽ��ϴ�."
													+ "�ٽ� �Է����ּ���");
		}else{
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		}
		
		
	}

}
