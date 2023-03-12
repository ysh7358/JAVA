package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
//		Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
//		객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
//		홍길동 마지막 값으로 변경(수정)
		map.put("홍길동", 95);
		
		System.out.println(map.size());
		
//		객체 찾기
		System.out.println(map.get("홍길동"));
		
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
