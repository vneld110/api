package api.lang.thread;
/*
 run() 호출 : 클래스 내부에 메소드 호출
 start() 호출 : 스레드가 작업을 실행하는 데 필요한 호출스택(call stack)을 생성하고
 				run()을 호출해서 생성된 호출스택에 run()을 저장.
 				즉, 스레드를 구현한 클래스는 start()를 통해 시작해야한다.
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new RunnableImpl();
		// 생성자 Thread(Runnable r)
		Thread thr = new Thread(r); // r 들어감!
		thr.start();
	}
}/*
 스레드 직접 상속받는 것 보다 Runnable 인터페이스를 
 구현하는 것이 좋다..
*/
class RunnableImpl implements Runnable { 

	@Override
	public void run() {
		for(int i=0; i<5; i++){
			/*
			 상속이 아니기 때문에 super 사용할 수 없다.
			 따라서 메소드 제안을 통해 getName을 호출하였다.
			 또한, Thread.currentThread() 의 리턴값이
			 String 이 아니라 Thread 인스턴스 객체임이 확실하다.
			 */
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}