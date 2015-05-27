package api.lang.object;
/*
 java.lang.Object Ŭ������ �޼ҵ� ��
 equals() : ���� ������ ���θ� üũ
 equals�� �ν��Ͻ� ������ �ؽ��ڵ� ��(���ּҰ�)�� ���ϴ� �޼ҵ��̴�.
 */
public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		// result �� ���������̱� ������ �ݵ��!!!�ʱ�ȭ!!!!!
		String result = "";
		// if(){}else{}
/*		if(t1.equals(t2)){
			System.out.println("t1�� t2�� ���� ����.");
		}else{
			System.out.println("t1�� t2�� ���� �ٸ���.");
		}*/
		/*
		 ���׿����ڴ� if-else�� ��ü�ϴ� ����.
		 ������
		 (���ǽ�)?(���ΰ��):(�����ΰ��);
		 */
		result = (t1.equals(t2))?"t1�� t2�� ���� ����.":"t1�� t2�� ���� �ٸ���.";
		System.out.println("�����ڸ� ���� ������ �������� ���� ��\n"+result);
		
		t2 = t1;
		result = t1.equals(t2) ?"t1�� t2�� ���� ����.":"t1�� t2�� ���� �ٸ���.";
		System.out.println("�������� ������ �Ҵ�� ���� ���� ���� ��\n"+result);
	
	}
}
class Temp{
	int num; // �ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ�� �ʿ� ����.
	public Temp(int num) {
		this.num = num;
		/*
		 ��� ���´� ���� ����� �ν��Ͻ� ������
		 �� ���ÿ� �ִ� num ���������� �Ҵ�� ����
		 �ν��Ͻ� ������ �Ѱ��ְ� �������� �ڽ��� �����.
		 */
	}
}
