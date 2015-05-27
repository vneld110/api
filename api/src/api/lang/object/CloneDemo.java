package api.lang.object;

import java.util.Arrays;

/*
 java.lang.Object Ŭ������ �޼ҵ� �߿�
 clone()�� ��ü�� �����Ѵ�.
 */
public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		// �迭�� �ѹ� ������ ������Ű�� �߰��Ҵ��� �����ʴ´�.
		// �������� �Ҵ��ϰ��� �� ���� ArrayList�� ����Ѵ�.
		
		int[] arr2 = arr.clone();
		// arr�迭�� ������ ���� arr2�� �״�� �Ҵ��Ѵ�.
		for(int i=0; i<arr2.length; i++){
			System.out.print(arr[i]+"\t"); // \t : �̽����������ڷ� tab
		}
		System.out.println();
		
		System.out.println("==============");
		System.out.println("Arrays �� ���");
		System.out.println("arr�� ������:"+Arrays.toString(arr));
		System.out.println("arr2�� ������:"+Arrays.toString(arr2));
	}
}
