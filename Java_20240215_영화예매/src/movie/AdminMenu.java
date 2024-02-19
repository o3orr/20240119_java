package movie;

import java.io.IOException;
import java.util.ArrayList;

public class AdminMenu extends AbstractMenu{
	
	private static final AdminMenu instance = new AdminMenu(null);
	
	private static final String ADMIN_MENU_TEXT = //기본문구
			"1: 영화 등록하기\n" +
			"2: 영화 목록 보기\n" +
			"3: 영화 삭제하기\n" +
			"b: 종료\n\n" +
			"메뉴를 선택하세요: ";
	
	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}
	
	public static AdminMenu getInstance() {
		return instance; //AdminMenu 객체 생성 주소반환(싱글톤패턴)
	}

	
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "1" :
			createMovie(); //영화 등록 진행
			return this;
		case "2" : 
			try {
				printAllMovie();
			} catch (IOException e) {
				e.printStackTrace();
			}   //영화 목록 출력
			return this; //영화목록 출력한 후 adminMenu 반환
		case "3" :
			deleteMovie();
			return this;
		case "b" : return prevMenu; //b입력하면, 이전 메뉴 반환 Main
		default : return this; //자기자신 AdminMenu객체 ==> new AdminMenu(null);
		}
	}

	
	
	private void deleteMovie() {
		try {
			printAllMovie();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 전체 목록 출력한다
		
		System.out.println("삭제할 영화의 id값을 입력하세요: ");
		
		Movie.delete(sc.nextLine()); //movie의 delete함수 호출
		System.out.println(">> 삭제되었습니다");
	}
	

	private void createMovie() {
		
		System.out.print("제목: ");
		String title = sc.nextLine();
		
		System.out.print("장르: ");
		String genre = sc.nextLine();
		
		Movie movie = new Movie(title, genre);
		
		movie.save(); //movie의 save함수 호출
		System.out.println(">> 저장되었습니다");
		
	}

	private void printAllMovie() throws IOException {
	
		ArrayList<Movie> movies = Movie.findAll();
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
