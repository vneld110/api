package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInforDemo {
	public static void main(String[] args) {
		System.out.println("���� �̸��� ��������.");
		String name = ""; // �������� �ʱ�ȭ.
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine(); // �� ������ �о����
		}catch(Exception ex){
			ex.printStackTrace();
		}
		File file = new File(name);
		if(file.exists()){
			System.out.println("�����̸�: "+file.getName());
			System.out.println("���ϰ��: "+file.getPath());
			System.out.println("���Ⱑ�ɿ���: "+file.canWrite());
			System.out.println("�бⰡ�ɿ���: "+file.canRead());
			System.out.println("���ϱ���: "+file.length());
		}else{
			System.out.println("�ش������� �������� �ʽ��ϴ�.");
		}
	}
	/*
	 ���
	 >>
	 ���� �̸��� ��������.
	 c:/text.txt
	 �����̸�: text.txt
	 ���ϰ��: c:\in.txt
 	 ���Ⱑ�ɿ���: true
  	 �бⰡ�ɿ���: true
	 ���ϱ���: 7

	 */
}

