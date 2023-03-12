package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
//		Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
//		ȫ�浿 ������ ������ ����(����)
		map.put("ȫ�浿", 95);
		
		System.out.println(map.size());
		
//		��ü ã��
		System.out.println(map.get("ȫ�浿"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + value);
			
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
			
			while(entryIterator.hasNext()) {
				Map.Entry<String, Integer> entry = entryIterator.next();
				String key1 = entry.getKey();
				Integer value1 = entry.getValue();
				System.out.println(key1 + value1);
			}
		}
	}
}
