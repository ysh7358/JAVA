package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		forEach()
//		여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//		forEach 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//		매개변수에는 컬렉션 객체 안에 들어있는 값들이 순서대로 담기고,
//		화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		chinaTown.put("자장면", 4500);
//		chinaTown.put("짬뽕", 5500);
//		chinaTown.put("탕수육", 14500);
//		
//		chinaTown.values().stream().forEach(price -> System.out.println(price));
//		chinaTown.values().forEach(price -> System.out.println(price));
//		chinaTown.values().forEach(System.out::println);
//		
//		datas.add(10);
//		datas.add(20);
//		datas.add(30);
//		datas.add(40);
//		
//		datas.forEach(values -> System.out.println(values));
//		전달받은 매개변수를 그대로 메소드에 사용할 경우에는 참조형 문법을 사용할 수 있다.
//		소속::메소드명 --> 전달받은 값을 메소드의 매개변수로 바로 전달해준다.
//		datas.forEach(System.out::println);
		
//		IntStream.range()
//		IntStream.range(0, 10).forEach(System.out::println);
		
//		IntStream.rangeClosed()
//		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		
//		chars() : 문자열을 IntStream으로 변경
//		String data = "ABC";
//		data.chars().forEach(value -> System.out.print((char)value));
		
//		map() : 기존값을 원하는 값으로 변경
//		String data = "ABC";
//		data.chars().map(value -> value + 3).forEach(value -> System.out.print((char)(value)));
		
//		filter() : 조건식을 사용하여 false일 경우는 제외
//		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::print);
		
//		sorted()
		Integer[] arData = {10, 40, 20, 30};
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect()

	}
}












