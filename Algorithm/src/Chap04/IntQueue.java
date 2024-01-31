package Chap04;

public class IntQueue {
	private int[] que; //큐의 본체용 배열
	private int capacity; //큐의 용량
	private int front; //맨 앞의 요소 커서
	private int rear; //맨 뒤의 요소 커서
	private int num; //현재 데이터 개수
	
	
	// 실행 시 예외 : 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	
	// 실행 시 예외 : 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	public IntQueue(int maxlen) {
		num = front = rear = 0; //큐 처음 생성할때 데이터개수와 맨앞 맨뒤 요소 커서 0
		capacity = maxlen; //큐의 용량은 생성자에 정수값 넣어서 초기화
		try { //이 동작을 하면
			que = new int[capacity]; //큐용 배열 본체 용량넣어서 초기화
		} catch (OutOfMemoryError e) { //이런 예외가 발생할 수 있다
			capacity = 0; //그냥 용량을 0으로 처리해서 예외 처리
		}
	}
	
	//큐에 데이터 넣기
	public int enque(int x) throws OverflowIntQueueException {
		if (num >= capacity) { //현재 데이터 개수가 용량 보다 많으면
			throw new OverflowIntQueueException();
		}
		que[rear++] = x; //프론트는 0, 리어는 1이 됨 0에 x의 값이 저장
		num++; //현재 데이터개수 1
		
		if (rear == capacity) {
			rear = 0; //원이니까 한바퀴돌아서 다음으로
			// 이렇게하면 다음에 인큐할 데이터가 que[0]위치에 제대로 저장
		}
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++]; //x에 프론트에 있는 값 넣기 맨 앞 값이 빠졌으니까 프론프순서를 하나앞으로
		num--; //현재 데이터의 개수 줄이기
		if (front == capacity) {
			front = 0; //만약 프론트가 계속 늘어서 용량과 같아진다면 프론트의 위치를 0으로 변경
		}
		return x;
	}
	
	//큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front]; //큐는 맨앞에 들어온 게 가장 먼저 나가는 구조 맨앞의 요소를 리턴
	}
	
	
	//큐를 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	
	//큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(int x) {
		for (int i=0; i<num; i++) {
			int idx = (i + front) % capacity; //큐의 프런트를 반환하는 식
			if (que[idx] == x) {
				return idx;
			}
		}
		return -1;
	}
	
	//큐의 용량을 반환
	public int getCapacity() {
		return capacity;
	}
	
	//큐에 쌓여있는 데이터 개수를 반환
	public int size() {
		return num;
	}
	
	
	//큐가 비어있나요?
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//큐가 가득 찼나요
	public boolean isFull() {
		return capacity <= num;
	}
	
	
	//큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다");
		else {
			for (int i=0; i<num; i++) {
				System.out.print(que[(i + front) % capacity] + " ");
			}
			System.out.println();
		}
	}
	
	
/*	public int search(int x) throws EmptyIntQueueException {
		 for (int i=0; i<capacity; i++) {
			 if(num <= 0) {
				 throw new EmptyIntQueueException();
			 }
			 if (que[i] == x) {
				 return i;
			 }
		 }
		 return -1;*/
	}


