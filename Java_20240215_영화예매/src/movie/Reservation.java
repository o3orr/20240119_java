package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reservation {
	
	private long id; // 예매번호
	private long movieId; //영화 구별 번호
	private String movieTitle; //영화 제목
	private String seatName; //좌석
	
	private static final File file = new File("src/movie/reservations.txt");
	
//	Reservation(long id, long movieId, String movieTitle, String SeatName) {
//		this.id = id;
//		this.movieId = movieId;
//		this.movieTitle = movieId;
//		this.movieId = movieId;
//	}
	
	public static Reservation findById(String reservationId) {
		Reservation reservation = null;
		BufferedReader br = null;
		String line = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			while((line = br.readLine()) != null) {
				
				String[] temp = line.split(",");
				if(reservationId.equals(temp[0])) {
					// 사용자가 입력한 예매번호랑 line에 있는 예매번호랑 같으면 
					reservation = new Reservation(Long.parseLong(temp[0]), Long.parseLong(temp[1]), temp[2], temp[3]);
					// 새로운 예매객체 생성해서 반환 -> 예매내역 알려줌
					break;
				}
				
			}
			br.close();
			return reservation;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public String toString() {
		return String.format("영화: %s, 좌석: %s", movieTitle, seatName);
	}
	
	

}
