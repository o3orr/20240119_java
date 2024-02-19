import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		ArrayList list2 = new ArrayList(list1.subList(1,4));
		print(list1, list2);

	}

	private static void print(ArrayList list, ArrayList list2) {

		
	}

}
