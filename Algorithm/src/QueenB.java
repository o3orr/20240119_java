
public class QueenB {
	static int[] pos = new int[8]; //각 열에 있는 퀸의 위치
	
	
	//각 열에 있는 퀸의 위치를 출력
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		} 
		System.out.println();
	}

	public static void main(String[] args) {
	

	}

}
