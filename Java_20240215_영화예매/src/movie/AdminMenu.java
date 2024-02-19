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
		case "2" : 
			try {
				printAllMovie();
			} catch (IOException e) {
				e.printStackTrace();
			}   //영화 목록 출력
			return this; //영화목록 출력한 후 adminMenu 반환
		case "b" : return prevMenu; //b입력하면, 이전 메뉴 반환 Main
		default : return this; //자기자신 AdminMenu객체 ==> new AdminMenu(null);
		}
	}

	
	
	private void printAllMovie() throws IOException {
	
		ArrayList<Movie> movies = Movie.findAll();
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}
	}

}
