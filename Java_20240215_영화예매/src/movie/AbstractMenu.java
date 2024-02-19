package movie;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractMenu implements Menu{ //추상클래스
	// 메뉴인터페이스의 추상메서드 print하나만 구현

	protected String menuText; //기본문구
	protected Menu prevMenu; //이전 메뉴
	//메뉴타입 참조변수 
	
	protected static final Scanner sc = new Scanner(System.in);
	
	//AbstractMenu(String menuText, Menu prevMenu) {
//		this.menuText = menuText;
//		this.prevMenu = prevMenu;
//	}
	
//	public void setPrevMenu(Menu prevMenu) {
//		this.prevMenu = prevMenu;
//	}
	

	@Override
	public void print() {
		System.out.print("\n" + menuText); // 메뉴출력	
	}
	//print는 공통속성이니까 인터페이스로 빼서 사용

//	@Override
/*	public Menu next() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
