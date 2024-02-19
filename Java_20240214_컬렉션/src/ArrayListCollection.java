import java.util.*;

public class ArrayListCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		List<String> llist =  new LinkedList<String>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		
		for(String str : list) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		list.remove(0);
		//앞자리가 삭제되면 뒤 데이터들이 전부 앞으로 한칸씩 이동한다
		//따라서 arraylist는 빈번한 삭제가 있는 경우에는 속도가 저하 될 수 있다
		
		for (String str : list)
			System.out.println(str + " ");

	}

}
