package api.lang.string;
/*
 java.lang.Striing
 split("������") : �����ڸ� �������� String ���ڿ��� �и��Ͽ�
 �迭 ��(ArrayList����)�� ������� ���.
 split("������",����) : ���ڸ� ������ �ܾ� ������ ������ ������ ������ ��
 ������ ����Ʈ�� ��� ���� �ش�.
 */
import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0; i<fruits.length; i++){
			System.out.println("\t"+fruits[i]);
		}
		System.out.println();
		System.out.print("split(String,int) ��°�� : ");
		String[] fruits2 = fruit.split(",",2);
		/*
		 split(String, int)
		 String �ڸ��� ","�� ��ü�ϰ�
		 int ������ŭ ������ �ش�. ������ ����Ʈ�� ��� ����.
		 */
		System.out.println(Arrays.toString(fruits2));
	}
}
