package api.lang.thread;

public class AtmUserRunnableDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new AtmUser(atm,"ȫ�浿");
		Runnable kim = new AtmUser(atm,"��浿");
		Runnable moon = new AtmUser(atm,"���浿");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(moon);
		thr3.start();
	}
}
class Atm{
	public synchronized void inchul(String name){
		System.out.println(name+"���� �����û��");
		for(int i=0; i<=100000000;i++){
			if(i==10000){
				System.out.println(name+"���� ������...");
			}
		}
		System.out.println(name+" ������ ����");
	}
}
class AtmUser implements Runnable{
	Atm atm;
	String name;

	public AtmUser(Atm atm, String name) {
		super(); 
		// �θ��� ����� ������ ���� ���� �����ڸ� �ڽ�Ŭ���� �����ڿ� ȣ��.
		this.atm = atm;
		this.name = name;
	}
	@Override
	public void run() {
		atm.inchul(name);
	}
	
}