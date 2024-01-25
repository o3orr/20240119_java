package ex02;

public class Exam02 {
	
	static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int calculateEvenSum(final int a) {
		int sum=0;
		for (int i=1; i<=a; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		
		//System.out.println(findMax(arr));
		
		System.out.println(calculateEvenSum(4));

	}

}
