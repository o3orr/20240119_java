
public class Exam01 {
	
	int abs(int num) {
		return num>0 ? num : -num; 
	}
	
	
	int[] change(int num) {
		int[] arr = new int[num];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		Exam01 e = new Exam01();
		
		System.out.println(e.abs(-10));
		
		
		int[] resultArray = e.change(5);
		
		for (int i = 0; i < resultArray.length; i++) {
		    System.out.print(resultArray[i] + " ");
		}
		
		
		
		

	}

}
