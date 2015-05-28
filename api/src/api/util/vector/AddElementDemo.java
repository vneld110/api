package api.util.vector;

import java.util.Vector;

/*
 java.util.Vector
 addElement() : �⺻������ add() �� ����
 */
public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hulk","hawk"};
		Vector<String> avengers = new Vector<String>();
		// ���ʹ� �迭�� ��Ҹ� ����. addElement()
		for(int i=0; i<heros.length; i++){
			avengers.addElement(heros[i]);
		}
		// �丣�� �����ϴ��� üũ. contains() ���.
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("�丣�� "+idx+"��°�� �ֽ��ϴ�.");
		}else{
			System.out.println("�丣�� �����ϴ�..");
		}
		/*
		 ù��° ���(���) ����
		 ������ �ε����� (�迭�� ����) 0���� �����Ѵ�.
		 */
		avengers.removeElement(0); // 0��° ��� ����
		System.out.println("���� �� ��� ��ġ �ε��� ��ȭ");
		for(int j=0;j<avengers.size(); j++){
			System.out.println("Avengers�� "+(j+1)+"��° ����� "
											+ avengers.elementAt(j));
		}
		
		
	}
}
