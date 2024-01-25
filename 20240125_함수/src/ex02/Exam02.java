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
		
		
		//선택정렬
		for (int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++)  {
				int tmp;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
//		초기 배열: {5, 2, 9, 1, 5, 6}
//		i = 0일 때, j = 1부터 5까지 반복하여 arr[0]과 arr[j]를 비교하고 교환합니다.
//		arr[0] = 5, arr[1] = 2: 5와 2를 교환 (5는 2보다 크므로 교환)
//		arr[0] = 2, arr[2] = 9: 2와 9를 교환 (2는 9보다 작으므로 교환)
//		arr[0] = 2, arr[3] = 1: 2와 1을 교환 (2는 1보다 크므로 교환)
//		arr[0] = 1, arr[4] = 5: 1과 5를 교환 (1은 5보다 작으므로 교환)
//		arr[0] = 1, arr[5] = 6: 1과 6을 교환 (1은 6보다 작으므로 교환)
//		결과: {1, 2, 9, 5, 5, 6}
//		가장 작은 값 맨앞으로 보내줌
		
		
		//삽입정렬
		for (int i=1; i<arr.length; i++) {
			int tmp = arr[i];
			int j = i - 1;
			while ( j >= 0 && tmp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tmp;
		}
		
		
		
		String str= "korea";
		String str2 = "";
		
		String str3 = str.substring(2);
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str.substring(2));
		System.out.println(str3);
		
		System.out.println(str.substring(1, 4));
		
		String str4 = "math";
		String str5 = str.concat(str4);
		
		System.out.println(str.concat(str4));
		System.out.println(str5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
