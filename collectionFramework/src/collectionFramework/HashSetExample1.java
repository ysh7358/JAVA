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
//		반복자 얻기
		iterator = set.iterator();
		while(iterator.hasNext()) {
//			객체 수만큼 루핑
			String element1 = iterator.next();
			System.out.println(element1);
//			모든 객체 삭제
			set.clear();
		}
		}
	}
}
