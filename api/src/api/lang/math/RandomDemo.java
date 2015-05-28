package api.lang.math;

import java.util.Scanner;

/*
 java.lang.Math
 random() : 난수를 생성시키는 기능
 */
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int)(Math.random()*5)+1;
		/*
		 5는 limit값이고 1은 begin 값이다.
		 따라서, 위 예제는 1부터 5까지의 난수를 발생시키는 구문이다.
		 */
		int myVal;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true){
			i++;
			System.out.println("1부터 5까지 숫자 맞추기 입니다.\n총 세번의 기회가 있습니다.");
			System.out.println("현재는 "+i+"번째 시도입니다.");
			myVal = scanner.nextInt();
			if(myVal==com){
				System.out.println("컴퓨터가 발생한 숫자:"+com);
				System.out.println("빙고~~");
				break;
			}
			if(i==3){
				System.out.println("실패입니다.");
				break;
			}
		}
	}
}
