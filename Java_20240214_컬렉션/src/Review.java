import java.time.LocalDate;

public class Review implements Comparable<Review>{
	
	int reviewCount; //리뷰수
	LocalDate date;
	
	public Review(int reviewCount, LocalDate date) {
		super();
		this.reviewCount = reviewCount;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Review [reviewCount=" + reviewCount + ", date=" + date + "]";
	}
	@Override
	public int compareTo(Review o) {
		//매개변수로 Review객체를 줌
		int x = this.reviewCount;
		int y = o.reviewCount; //Review객체의 reviewCount접근
		
		//원래 리뷰객체의 reviewCount와 비교하고싶은 객체의 reviewCount비교
		
		// x == y -> 0
		// x > y -> 1
		// x < y -> -1
		
		int result = 0;
		
		if(x > y) {
			result = 1;
		} else if (x < y) {
			result = -1;
		} else {
			result = 0;
		}
		
		return (x > y) ? 1 : ( (x < y)? -1 : 0);
	} //Comparable에는 compareTo()추상메서드 하나 존재
	
}
