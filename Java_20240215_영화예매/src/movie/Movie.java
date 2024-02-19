package movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Movie {
	
	private long id; //영화 ID
	private String title;  // 영화 제목
	private String genre; // 영화 장르
	
	private static final File file = new File("src/movie/movies.txt");
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	public static ArrayList<Movie> findAll() throws IOException {
		
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line = null;
		
		while((line =  br.readLine()) != null) {
			//16271757, 어벤져스, 판타지 -> 파일에서 한 줄 읽어왔다
			
			String[] temp = line.split(",");
			//temp[0] : //16271757
			//temp[1] : 어벤져스
			//temp[2] : 판타지
			
			Movie m = new Movie(Long.parseLong(temp[0]), temp[1], temp[2]);
			//파일에서 읽어온 데이터는 문자로 인식한다 따라서 16271757을 long으로 변환
			
			movies.add(m); //ArrayList에 파일 저장된 영화 목록 추가
		}
		br.close(); //연결 통로 끊기
		
		return movies;  //영화 객체가 담긴 ArrayList 반환
	}

	@Override
	public String toString() {
		return String.format("[%d]: %s(%s)", id, title, genre);
		
		// "[1627175707] : 어벤져스(판타지)"
	}

	
	
	
}
