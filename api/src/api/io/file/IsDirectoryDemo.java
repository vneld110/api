package api.io.file;

import java.io.File;

/*
 java.io.File
 isFile() : �ش� ������ �ִ��� ���θ� Ȯ��, ������ false
 isDirectory : �ش� �н��� ���丮(����)�� �����ϴ���, ������ false
 */
/*
 ���丮 vs ���� : ���� �ǹ�.
 ���丮(directory) : �ؽ�Ʈ ���� cmdâ���� ��� ���нÿ� �ǹ̰� £��.
 ����(folder) : GUI ��忡�� ������ �־� �δ� ���� �ǹ̰� ���ϴ�.
 				������ ������ �� ��ü�� Window 3.5 �̻��� �������� �����ߴ�.
 				���� DOS ��忡���� ���丮�� ���� ���.
 */
public class IsDirectoryDemo {
	public static void main(String[] args) {
		// String directory = "c:/text.txt"; ������ �ƴ�
		// File.separator : ���丮 �����ڰ� ��Ȯ���Ҷ�
						//  �������� �����ڸ� ȣ���ϴ� Ŭ���� ����.
		String directory = "c:"+File.separator+"temp";
		// import ����Ű ctrl +shift +o
		File file = new File(directory);
		// ���丮���� �˻�
		if(file.isDirectory()){
			System.out.println("�˻� ���丮: "+ directory);
			System.out.println("���丮 �������� ���");
			String str[] = file.list();
			for(int i=0; i<str.length; i++){
				File file2 = new File(directory +"\\"+str[i]);
				if(file2.isDirectory()){
					System.out.println(str[i]+" : ���丮");
				}else{
					System.out.println(str[i]+" : ����");
				}
			}
		}else{
			System.out.println("������ "+directory+"�� ���丮�� �ƴ�");
		}
	}
}
