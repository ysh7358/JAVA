package collectionFramework;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
//		���� �ʱ�ȭ
		int size = 0;
		String skill = null;
//		��̸���Ʈ ����
		ArrayList<String> arList = new ArrayList<>();
//		��ü 5�� �߰�
		arList.add("Java");
		arList.add("JDBC");
		arList.add("Servlet/JSP");
		arList.add(2, "Database");
		arList.add("iBATIS");
//		size() = ��̸���Ʈ�� ����ִ� ��ü�� ����
		size = arList.size();
		System.out.println("�� ��ü �� : " + size);
//		2��° �ε����� �ִ°� �������� get �޼���
		skill = arList.get(2);
		System.out.println("2 : " + skill);
//		������ �̿��ؼ� ��ü ��̸���Ʈ ��� ���
		for (int i = 0; i < arList.size(); i++) {
			String str = arList.get(i);
			System.out.println(i + " : " + str);
		}
//		���� ����
		for (String string : arList) {
			System.out.println(string);
		}
	}
}
