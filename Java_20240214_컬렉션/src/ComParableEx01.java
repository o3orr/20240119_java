import java.time.LocalDate;
import java.util.*;

public class ComParableEx01 {

	public static void main(String[] args) {

		List<Integer> list1 = 
				new ArrayList<>(Arrays.asList(10, 7, 9, 1, 20, 3));
		
		System.out.println("정렬전: " + list1);
		
		Collections.sort(list1);
		System.out.println("정렬후: " + list1);
		
		
		List<Review> review = new ArrayList<Review>();
		review.add(new Review(10, LocalDate.of(2024, 2, 15)));
		review.add(new Review(1, LocalDate.of(2023, 4, 25)));
		review.add(new Review(8, LocalDate.of(2024, 6, 5)));
		review.add(new Review(2, LocalDate.of(2023, 10, 10)));
		review.add(new Review(20, LocalDate.of(2024, 10, 30)));
		

		/*
		 * for(Review re : review) { System.out.println(re); }
		 */
		
		Collections.sort(review);
		for(Review re : review) {
			System.out.println(re);
		}
		// Comparable인터페이스를 구현해 CompareTo메서드를 오버라이딩해서
		// Collections.sort를 사용해서 정렬할 수 있게 됨
	}

}
