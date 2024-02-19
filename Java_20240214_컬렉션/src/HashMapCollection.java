import java.util.*;

public class HashMapCollection {

	public static void main(String[] args) {
		
		//Hashmap보다는 조상인 map써주는게 좋음
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(33, "Toy");
		map.put(47, "Box");
		map.put(67, "Robot");
		map.put(47, "Box");
		
		System.out.println(map.get(33));
		
		map.remove(33);
		
		System.out.println(map.get(33));
		
		Set<Integer> set = map.keySet(); //키만 모아서 set저장한다
		// 33, 47, 67
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()) + '\t');
			// it.next에 33, 47, 67
		}
		

	}

}
