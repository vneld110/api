package api.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		ThreadExtends thr = new ThreadExtends();
		/*
		 �����带 �� �𸣴� ��Ȳ������
		 �Ʒ� ȣ�� �޼ҵ带 run()�̶�� �ϱ� ����
		 �� ����.
		 �ݵ�� ȣ��� start()�� ���ؼ� �ؾ��Ѵ�.
		 �׷��� ���������� run()�� ������ �������� �ݹ�޼ҵ带 ȣ���ϰԵȴ�.
		 */
		thr.start();
	}
}
class ThreadExtends extends Thread {
	// �����带 ��� ���� �� �ڵ� ������
	// ctrl + space + r + enter
	public void run(){
		for(int i=0; i<5; i++){
			/*
			 getName()�� �� Ŭ������ �θ��� 
			 Thread�� ������ �ִ� �޼ҵ��̴�.
			 �θ��� �޼ҵ带 �������̵� ����
			 �ٷ� ����Ϸ��� super��� ȣ���ߴ�.
			 */
			System.out.println(super.getName());
		}
	}
	
	
}