package api.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̵� �Է����ּ���.");
		String id = scanner.next();
		System.out.println("��й�ȣ�� �Է����ּ���.");
		String password = scanner.next();
		System.out.println("�̸��� �Է����ּ���.");
		String name = scanner.next();
		System.out.println("���̸� �Է����ּ���.");
		int age = scanner.nextInt();
		System.out.println("�ּҸ� �Է����ּ���.");
		String addr = scanner.next();
		
		/*
		 ��ü�� �����ؼ� �ϼ������ּ���.
		 ��ü�� �����ϴ� ������ .. ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ����.
		*/
		MemberService service = new MemberServiceImpl();
		id = "hong";
		password = "pass";
		name = "ȫ�浿";
		age = 20;
		addr = "����";
		service.join(id, password, name, age, addr);
		
		System.out.println("ȸ�������� �Ǿ����ϴ�.");
		System.out.println("�α����� ���ּ���.");
		System.out.println("ID�� �Է����ּ���.");
		id = scanner.next();
		System.out.println();
		System.out.println("��й�ȣ�� �Է����ּ���.");
		password = scanner.next();		
		//��ü�� ȣ���ϴ� �޼ҵ�� �ϼ������ּ���.
		service.login(id, password);

		
	}
}
