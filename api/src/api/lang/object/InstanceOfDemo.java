package api.lang.object;
/*
 ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ����
 instanceof �����ڸ� ����Ѵ�.
 ������ ����δ� true �� false �� �ϳ��� �����Ѵ�.
 */

public class InstanceOfDemo {
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		Amblulance amblulance = new Amblulance();
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(amblulance);
		
	}
	public void doWork(Car c){
		/*
		 �ҹ����� Car Ÿ������ Ȯ�� ��
		 �´ٸ� (FireCar)�� ��ü ĳ������ �Ѵ�.
		 */
		if(c instanceof FireCar){
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
		/*
		 �������� Car Ÿ������ Ȯ�� ��
		 �´ٸ� (Amblulance)�� ��ü ĳ������ �Ѵ�.
		 */
		}else if(c instanceof Amblulance){
			Amblulance a = (Amblulance) c;
			a.driver();
			a.siren();
			a.stop();
		}
	}
}
class Car{
	String color;
	int door;
	void driver(){
		System.out.println("������..");
	}
	void stop(){
		System.out.println("����!!");
	}
}
class FireCar extends Car{ // CarŬ������ ��ӹ��� �ҹ���
	void shootWater(){
		System.out.println("���ѷ� �Ҳ�����..");
	}
}
class Amblulance extends Car{ // CarŬ������ ��ӹ��� ������
	void siren(){
		System.out.println("���̷��� �︮�� ������..");
	}
}