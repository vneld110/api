package api.lang.object;
// import java.lang.Object; �������� �ʾƵ� ����Ʈ�� import �Ǿ���.
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade",7);
		Card card2 = new Card("heart",2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		/*
		 java.lang.Object�� toString�� �ؽ��ڵ�(��ü�ּҰ�)�� 
		 �����ϹǷ�, toString()�� �������̵��ؼ� ���ϴ� ����� �򵵷� �Ѵ�.
		 */
	}
}
// �� java ���Ͽ� �ΰ� �̻��� Ŭ������ �־ �ǳ�
// �ݵ�� public�� �ϳ����� �Ѵ�.
class Card{
	String kind;
	int number;
	public Card() {
		this("",0);
	}
	// ������ overloading�� �����ϴ� ���
	// default �����ڸ� ctrl+spacebar ������Ų��
	// ������ ȣ�� ������� this(�Ķ���� ������ Ÿ���� �ڵ�);�ϸ� �ڵ�����
	
	// ���� ����Ʈ �����ڸ� ȣ���ϴ��� �Ķ���Ͱ� �ִ� �����ڱ��� ȣ��ǹǷ�
	//������ �Ķ���� ������� �� �ʿ���� �ڵ� ����������.
	public Card(String kind, int i) {
		this.kind = kind;
		this.number = i;
	}
	// getter setter�� �ʿ�ø� �����.

	
	// ctrl + space bar ���� toString ����� �ϵ��ڵ��� �þ��
	// alt +shift +s > generate toString
	
	@Override
	public String toString() {
		return "ī�� [����=" + kind + ", ����=" + number + "]";
	}
	
}
