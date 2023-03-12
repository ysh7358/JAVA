package collectionFramework;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
//		변수 초기화
		int size = 0;
		String skill = null;
//		어레이리스트 생성
		ArrayList<String> arList = new ArrayList<>();
//		객체 5개 추가
		arList.add("Java");
		arList.add("JDBC");
		arList.add("Servlet/JSP");
		arList.add(2, "Database");
		arList.add("iBATIS");
//		size() = 어레이리스트에 담겨있는 객체의 갯수
		size = arList.size();
		System.out.println("총 객체 수 : " + size);
//		2번째 인덱스에 있는걸 가져오는 get 메서드
		skill = arList.get(2);
		System.out.println("2 : " + skill);
//		포문을 이용해서 전체 어레이리스트 목록 출력
		for (int i = 0; i < arList.size(); i++) {
			String str = arList.get(i);
			System.out.println(i + " : " + str);
		}
//		빠른 포문
		for (String string : arList) {
			System.out.println(string);
		}
	}
}
