package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		forEach()
//		���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//		forEach �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//		Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//		�Ű��������� �÷��� ��ü �ȿ� ����ִ� ������ ������� ����,
//		ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
//		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		
//		chinaTown.put("�����", 4500);
//		chinaTown.put("«��", 5500);
//		chinaTown.put("������", 14500);
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
//		���޹��� �Ű������� �״�� �޼ҵ忡 ����� ��쿡�� ������ ������ ����� �� �ִ�.
//		�Ҽ�::�޼ҵ�� --> ���޹��� ���� �޼ҵ��� �Ű������� �ٷ� �������ش�.
//		datas.forEach(System.out::println);
		
//		IntStream.range()
//		IntStream.range(0, 10).forEach(System.out::println);
		
//		IntStream.rangeClosed()
//		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		
//		chars() : ���ڿ��� IntStream���� ����
//		String data = "ABC";
//		data.chars().forEach(value -> System.out.print((char)value));
		
//		map() : �������� ���ϴ� ������ ����
//		String data = "ABC";
//		data.chars().map(value -> value + 3).forEach(value -> System.out.print((char)(value)));
		
//		filter() : ���ǽ��� ����Ͽ� false�� ���� ����
//		IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(System.out::print);
		
//		sorted()
		Integer[] arData = {10, 40, 20, 30};
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect()

	}
}












