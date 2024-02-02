import java.util.*;
public class BubbleSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i<n-1; i++) {
			for (int j=n-1; j>i; j--)
			if(a[j-1] > a[j]) {
				swap(a, j-1, j);
			}
		}
	}
	
	//배열이 다 정렬된 상태일때 헛돌지 않도록
	static void bubbleSort2(int[] a, int n) {
		for (int i = 0; i<n-1; i++) {
			int count = 0; //패스에서 교환하는 횟수를 저장
			for (int j=n-1; j>i; j--)
			if(a[j-1] > a[j]) {
				swap(a, j-1, j);
			}
			if (count == 0) break; //교환이 이루어지지 않으므로 멈춤
		}
	}
	
	
	//뒤쪽에서 정렬이 되고 앞쪽으로오면 정렬을 안해도 될때
	static void bubbleSort3(int[] a, int n) {
		for (int i = 0; i<n-1; i++) {
			int count = 0; //패스에서 교환하는 횟수를 저장
			for (int j=n-1; j>i; j--)
			if(a[j-1] > a[j]) {
				swap(a, j-1, j);
			}
			if (count == 0) break; //교환이 이루어지지 않으므로 멈춤
		}
	}
	
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전 1)");
		System.out.println("크기: ");
		int nx = in.nextInt(); //배열 크기
		int[] x = new int[nx]; //크기가 nx인 배열 생성
		
		for (int i=0; i<nx; i++) {
			x[i] = in.nextInt();
		}
		
		bubbleSort(x, nx); //배열과 배열의 크기 넣음

	}

}
