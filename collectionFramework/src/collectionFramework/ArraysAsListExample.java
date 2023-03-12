package collectionFramework;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
//		asList�� �߰��� ��ü���� ���´�(String Ÿ��) >> list�� �߰��ȴ�
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");
//		���� ������ �̿��Ͽ� list1�� �ִ� �̸����� ���
		for (String name : list1) {
			System.out.println(name);
		}
//		asList�� �߰��� ��ü���� ���´�(Integer Ÿ��) >> list�� �߰��ȴ�.
		List<Integer> list2 = Arrays.asList(1, 2, 3);
//		���������� �̿��Ͽ� list2�� �ִ� ������ ���
		for (Integer value : list2) {
			System.out.println(value);
		}
		
	}
}
