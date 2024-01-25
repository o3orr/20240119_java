
public class sample01 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		sample01 s = new sample01();
		
		int num = s.max(10, 20);
	

	}
	
	int max(int n1, int n2) {
		return n1>n2? n1 : n2;
	}
	
	int min(int n1, int n2) {
		return n1<n2? n1 : n2;
	}

}
