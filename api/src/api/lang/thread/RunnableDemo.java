package api.lang.thread;
/*
 run() ȣ�� : Ŭ���� ���ο� �޼ҵ� ȣ��
 start() ȣ�� : �����尡 �۾��� �����ϴ� �� �ʿ��� ȣ�⽺��(call stack)�� �����ϰ�
 				run()�� ȣ���ؼ� ������ ȣ�⽺�ÿ� run()�� ����.
 				��, �����带 ������ Ŭ������ start()�� ���� �����ؾ��Ѵ�.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();
		// ������ Thread(Runnable r)
		Thread thr = new Thread(r); // r ��!
		thr.start();
	}
}/*
 ������ ���� ��ӹ޴� �� ���� Runnable �������̽��� 
 �����ϴ� ���� ����..
*/
class RunnableImpl implements Runnable { 

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			/*
			 ����� �ƴϱ� ������ super ����� �� ����.
			 ���� �޼ҵ� ������ ���� getName�� ȣ���Ͽ���.
			 ����, Thread.currentThread() �� ���ϰ���
			 String �� �ƴ϶� Thread �ν��Ͻ� ��ü���� Ȯ���ϴ�.
			 */
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}