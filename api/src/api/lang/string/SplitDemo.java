package api.lang.string;
/*
 java.lang.Striing
 split("구분자") : 구분자를 기준으로 String 문자열을 분리하여
 배열 등(ArrayList포함)에 나눠담는 기능.
 split("구분자",숫자) : 숫자를 넣으면 단어 사이의 구분자 다음에 공백을 줌
 없으면 디폴트로 모두 공백 준다.
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
		System.out.print("split(String,int) 출력결과 : ");
		String[] fruits2 = fruit.split(",",2);
		/*
		 split(String, int)
		 String 자리를 ","로 대체하고
		 int 개수만큼 공백을 준다. 없으면 디폴트로 모두 공백.
		 */
		System.out.println(Arrays.toString(fruits2));
	}
}
