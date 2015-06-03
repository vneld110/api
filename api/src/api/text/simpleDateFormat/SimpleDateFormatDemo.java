package api.text.simpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		// ��Ŭ���� ���� ��  java.util.Date
		Date today = new Date();
		
		SimpleDateFormat date01,date02,date03,date04;
		date01 = new SimpleDateFormat("yyyy-MM-dd");//���� �빮��  MM
		date02 = new SimpleDateFormat("yy�� MM�� dd�� E����");
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// ���� �ҹ��� mm
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");// a �������� ǥ��
		
		System.out.println(date01.format(today));
		System.out.println(date02.format(today));
		System.out.println(date03.format(today));
		System.out.println(date04.format(today));
		
	}
}
