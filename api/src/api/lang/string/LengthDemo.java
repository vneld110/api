package api.lang.string;
/*
 java.lang.String
 length() : String���ڿ��� ���̸� ���ϴ� �޼ҵ�
 */
public class LengthDemo {
	public static void main(String[] args) {
		String tmp = "�ڹ� API�н�";
		int len = tmp.length();
		char[] tmpCharArr = new char[len];
		char[] charArr = new char[len];
		
		for(int i=0; i<len; i++){
			tmpCharArr[i] = tmp.charAt(i);
		}
		//reverse
		for(int j=0; j<len; j++){
			charArr[j] = tmpCharArr[len-1-j];
		}
		String reversTmp = new String(charArr);
		System.out.println(reversTmp);
		
	}
}
