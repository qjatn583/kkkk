package ja0601;

import java.util.*;

public class Ch15_04_MapEx {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
				
		map.put("�л�1",100);
		map.put("�л�2",90);
		map.put("�л�3",60);
		map.put("�л�4",80);
		map.put("�л�5",30);
		
		System.out.println("Map�� ����� ������ ��:" +map.size());
		//Ư��������ã��
		System.out.println(map.get("�л�1"));
		
		Set<String>keySet =map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+":"+value);
		}
		

	}

}
