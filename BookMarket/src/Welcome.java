import java.util.*;


public class Welcome {
	static final int NUM_BOOK = 3;
	static final int NUM_ITEM = 7;
	static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	static int mCartCount = 0;
	static User mUser;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM]; //2차원배열 [3][7] 선언
		
		
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String userName = sc.next();
		
		System.out.print("연락처를 입력하세요 : ");
		int userMobile = sc.nextInt();
		
		
		mUser = new User(userName, userMobile);
		
		
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market";
		
		boolean quit = false;
		
		while(!quit) {
		System.out.println("********************************************");
		System.out.println("\t"+greeting);
		System.out.println("\t"+tagline);
		/*
		 * System.out.println("********************************************");
		 * System.out.println("1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
		 * System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		 * System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
		 * System.out.println("7. 영수증 표시하기 \t8. 종료");
		 * System.out.println("********************************************");
		 */
		
		menuIntroduction();  // 메뉴 목록 출력 메서드 호출
		
		System.out.println("메뉴 번호를 선택해주세요 ");
		int n = sc.nextInt();
		System.out.println(n +"번을 선택했습니다");
		
		
		
		if (n < 1 || n > 9) {
			System.out.println("1부터 8까지의 숫자를 입력하세요");
		} else {
			switch(n) {
			case 1:
				menuGuestInfo(userName, userMobile);
				break;
			case 2:
				menuCartItemList();
				break;
			case 3:
				menuCartClear();
				break;
			case 4:
				menuCartAddItem(mBook);
				break;
			case 5:
				menuCartRemoveItemCount() ;
				break;
			case 6:
				menuCartRemoveItem();
				break;
			case 7:
				menuCartBill();
				break;
			case 8:
				menuExit();
				break;
			case 9:
				menuAdminLogin();
				break;
				
			}
		}
	}
		
	//메인 메서드 끝	
		
		
		

	}




		public static void menuIntroduction() {
			//메인메뉴 출력메서드
			System.out.println("********************************************");
			System.out.println("1. 고객 정보 확인하기 \t4. 장바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기 \t6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기 \t8. 종료");
			System.out.println("9. 관리자 로그인");
			System.out.println("********************************************");
	
	}
		
		
		public static void menuGuestInfo(String name, int mobile) {
			//고객 정보 출력메서드
			System.out.println("현재 고객 정보 : " );
			//Person person = new Person(name, mobile); //생성자로 사람 정보 초기화
			//System.out.println("이름 " + person.getName() + " 연락처 " + person.getPhone());
			//초기화된 정보 출력하기
			System.out.println("이름 " + mUser.getName() + "  연락처 " + mUser.getPhone());
		}
		
		
		public static void menuCartItemList() {
			System.out.println("2. 장바구니 상품 목록 보기");
			
			System.out.println("장바구니 상품 목록");
			System.out.println("---------------------------");
			System.out.println("  도서ID \t|  수량 \t|  합계");
			for (int i=0; i<mCartCount; i++) {
				System.out.println("  " + mCartItem[i].getBookID()+ " \t| ");
				System.out.println("  " + mCartItem[i].getQuantity()+ " \t| ");
				System.out.println("  " + mCartItem[i].getTotalPrice());
				System.out.println(" ");
			}
			System.out.println("---------------------------");
		}
		
		
		public static void menuCartClear() {
			System.out.println("3. 장바구니 비우기");
		}
		
		public static void menuCartAddItem(String[][] book) {
			//장바구니에 항목 추가하는 메서드
			
			BookList(book); //선언된 2차원배열안에 BookList메서드에서 값을 저장
			
			for (int i=0 ; i<NUM_BOOK; i++) { //저장되는 정보 출력하는 반복문
				for (int j=0 ; j<NUM_ITEM; j++) {
					System.out.print(book[i][j] + "|");
				} System.out.println("");
			}
			
			
			boolean quit = false;
			
			while (!quit) { 
				System.out.println("장바구니에 추가할 도서의 ID를 입력하세요 :");
				
				Scanner sc = new Scanner(System.in);
				String str = sc.nextLine(); // 도서의 id를 입력받음
				
				boolean flag = false;
				int numId = -1;
				
				for (int i=0; i< NUM_BOOK; i++) {
					if (str.equals(book[i][0]))  { //입력된 ID와 저장되어있는 id가 같은지 확인하고 
						numId = i;
						flag = true;
						break;
					}
					
				}
				
				if (flag) {
					System.out.println("장바구니에 추가하겠습니까? Y/N");
					str= sc.nextLine();
					
					if (str.equals("Y")) {
						System.out.println(book[numId][0] + "도서가 장바구니에 추가되었습니다");
						//장바구니에 넣기
						if (!isCartInBook(book[numId][0]))
							mCartItem[mCartCount++] = new CartItem(book[numId]);
					}
					quit = true;
				} else
					System.out.println("다시 입력해 주세요");
				
			}
		}
		
		public static void menuCartRemoveItemCount() {
			System.out.println("5. 장바구니의 항목 수량 줄이기");
		}
		
		public static void menuCartRemoveItem() {
			System.out.println("6. 장바구니의 항목 삭제하기");
		}
		
		public static void menuCartBill() {
			System.out.println("7. 영수증 표시하기");
		}
		
		public static void menuExit() {
			System.out.println("8. 종료");
		}
		
		
		public static void menuAdminLogin() {
			System.out.println("관리자 정보를 입력하세요");
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("아이디 : ");
			String adminId = input.next();
			
			System.out.println("비밀번호 : ");
			String adminPW = input.next();
			
			Admin admin = new Admin(mUser.getName(), mUser.getPhone());
			if (admin.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
				System.out.println("이름 " + admin.getName() + " 연락처 " + admin.getPhone() );
				System.out.println("아이디 " + admin.getName() + " 비밀번호 " + admin.getPhone() );
			} else {
				System.out.println("관리자 정보가 일치하지 않습니다");
			}
			
			
		}
		
		
		public static void BookList(String[][] book) {
			//도서 정보를 저장하는 메서드
			
			book[0][0] = "ISBN1234";
			book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
			book[0][2] = "27000";
			book[0][3] = "송미영";
			book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
			book[0][5] = "IT전문서";
			book[0][6] = "2018/10/08";
			
			
			book[1][0] = "ISBN1235";
			book[1][1] = "안드로이드 프로그래밍";
			book[1][2] = "33000";
			book[1][3] = "우재남";
			book[1][4] = "실습 단계별 명쾌한 멘토링!";
			book[1][5] = "IT전문서";
			book[1][6] = "2022/01/22";
			
			book[2][0] = "ISBN1236";
			book[2][1] = "스크래치";
			book[2][2] = "22000";
			book[2][3] = "고광일";
			book[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
			book[2][5] = "컴퓨터입문";
			book[2][6] = "2019/06/10";
			
		}
		
		public static boolean isCartInBook(String bookId) { //카트에 책이 있는지 확인하는 메서드
			boolean flag = false;
			for (int i=0; i<mCartCount; i++) {
				if (bookId == mCartItem[i].getBookID()) {
					mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
					flag = true;
				}
			}
			return flag;
		}
		
		
}
