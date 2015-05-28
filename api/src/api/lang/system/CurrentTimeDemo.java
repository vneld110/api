package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 java.lang.System
 currentTimeMillis()
 ROM �� ����� �ð��� �����Ѵ�.
 */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : "+curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 new Date()�ÿ� import ������ �ΰ����ε�
		 ����  java.util.Date ����
		 */
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("����ð� : "+nowTime);
	}
}
