package api.util.arrayList;
/*
 java.util.ArrayList
 : object 배열을 이용해서 데이터를 순차적으로 저장하는 공간.
 
 - 첫번째로 저장한 공간은 인덱스 0번값을 갖는다.
 - 배열에 더 이상 저장할 공간이 없으면 보다 큰 새로운 배열을 생성하여
   기존의 배열에 저장된 내용을 새로운 배열에 복사한 다음 저장한다.
 */
/*
 java.uil.Vector 와 차이점
 : 벡터는 멀티스레드에 대한 동기화가 되어있으나
   java.util.ArrayList 는 동기화가 되어있지 않다.
 
 - ArrayList와 Vector class 는 List를 크기 변경 가능한 배열로 구현한 것으로
   Vector class 객체는 기본적으로 동기화 되지만 ArrayList class는 그렇지 않다.
 - 비 동기화 된 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
   스레드들이 컬렉션을 공유하지 않는 프로그램에서는 일반적으로 Vector보다
   ArrayList를 더 선호하며, 동기화를 고려하지 않는 Vector처럼 동작함으로서
   스레드 동기화에 따르는 부담을 갖지않기 때문에 빠르게 실행한다. 
 */
public class ArrayListSyntax {
	
}
