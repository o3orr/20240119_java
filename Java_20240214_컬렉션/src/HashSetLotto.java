import java.util.*;

public class HashSetLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for (int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(new Integer(num));
		}
		
		List list = new LinkedList(set);
		//set에는 정렬함수가 없기때문에 set에 중복제거해 저장한값을 LinkedList에 담아서 정렬
		Collections.sort(list);
		System.out.println(list);

	}

}
