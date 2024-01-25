
public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6]; //로또번호 담을 배열선언
		
		for (int j=0; j<5; j++) {
			int k; 
			System.out.println("\n-------------------");
			
			for (int i=0; i<lotto.length; i++) { //6번 반복
				int ran = (int)(Math.random()*45) + 1; //로또번호 저장
				
				for (k=0; k<i; k++) { //중복체크 로또번호만큼 반복
					if (lotto[k] == ran) {
						i--;
						break;
					}
				}
				
				if (lotto[k] == ran)
					continue;
				
				lotto[i] = ran;
				
				System.out.println(lotto[i] + " ");
			}
		}

	}

}
