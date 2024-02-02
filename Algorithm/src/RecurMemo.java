
public class RecurMemo {
	static String[] memo;
	
	static void recur(int n) {
		if (memo[n+1] != null) { //저장되었는지 알고싶은 메모가 비어있지않다면
			System.out.print(memo[ n+1 ]); //메모를 출력
		} else { //만약 메모가 비어있고 다시 채워야한다면
			if(n>0) {
				recur(n-1);
				System.out.println(n);
				recur(n-2);
				memo[n+1] = memo[n] + n + "\n" + memo[n-1]; //메모화
			} else {
				memo[n+1] = ""; //메모화 : recur(0)과 recur(-1)은 빈문자열
			}
		}
	}


	public static void main(String[] args) {
		
	}

}
