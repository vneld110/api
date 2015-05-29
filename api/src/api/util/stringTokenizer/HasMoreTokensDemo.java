package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	public static void main(String[] args) {
		/*
		 구분자 혹은 문법 요소 단위를 token 이라 하는데
		 특정 구분자를 지정하면 그것을 기준으로 잘라내는 클래스와 메소드.
		 */
		String date = "2015/05/24";
		StringTokenizer tok = new StringTokenizer(date,"/");
		/*
		 위 생성자 파라미터 중 
		 앞 date : String 대상 객체, 뒤 "/" : 구분자 
		 */
		int idx = 0; 
		/*
		 while - enumeration
		 hasMoreElements 를 hasMoreTokens 로 변경.
		 
		 String token = tok.nextToken();
		 */
		while (tok.hasMoreTokens()) { 
			String token = tok.nextToken();
			System.out.println("["+idx+"] : "+token);
			idx++;
			
		}
	}
}
