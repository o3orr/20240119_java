import java.util.*;

public class Collection01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		for (int i=10; i>=1; i--) {
			num.add(i);
		}
		
		System.out.println(num);
		
		System.out.print("정렬 전 : ");
		for (int i=0; i<num.size(); i++) {
			System.out.print(num.get(i) + " ");
		}
		
		num.sort(Comparator.naturalOrder());
		//arraylist정렬
		
		System.out.println();
		System.out.print("정렬 후 :");
		for (int i = 0; i < num.size(); i++) {
			System.out.print(num.get(i) + " ");
		}

	}

}
