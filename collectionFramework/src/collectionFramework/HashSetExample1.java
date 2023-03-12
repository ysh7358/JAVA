package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
		String element = iterator.next();
		System.out.println(element);
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println(set.size());
//		�ݺ��� ���
		iterator = set.iterator();
		while(iterator.hasNext()) {
//			��ü ����ŭ ����
			String element1 = iterator.next();
			System.out.println(element1);
//			��� ��ü ����
			set.clear();
		}
		}
	}
}
