import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFuction {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr2;
		
		Arrays.fill(arr, 20);
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.setAll(arr, i -> (int)(Math.random()*45 + 1));
		
		System.out.println(Arrays.toString(arr));
		
		arr2 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arr2));
		
		//ArrayList는 선언과 동시에 초기화 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);

	}

}
