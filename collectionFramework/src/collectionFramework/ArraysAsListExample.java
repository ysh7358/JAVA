package collectionFramework;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
//		asList에 추가할 객체들을 적는다(String 타입) >> list에 추가된다
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
//		빠른 포문을 이용하여 list1에 있는 이름들을 출력
		for (String name : list1) {
			System.out.println(name);
		}
//		asList에 추가할 객체들을 적는다(Integer 타입) >> list에 추가된다.
		List<Integer> list2 = Arrays.asList(1, 2, 3);
//		빠른포문을 이용하여 list2에 있는 값들을 출력
		for (Integer value : list2) {
			System.out.println(value);
		}
		
	}
}
