import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<String>();
		
		set.add("Toy");
		set.add("Robot");
		set.add("Box");
		set.add("Toy");
		
		Iterator<String> it = set.iterator(); //반복자
		
		while(it.hasNext()) {
			System.out.print(it.next() + '\t');
		}
		
		it = set.iterator(); //한번더 출력하고 싶으면 반복자 초기화

		
		while(it.hasNext()) {
			System.out.print(it.next() + '\t');
		}

	}

}
