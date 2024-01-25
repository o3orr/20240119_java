import java.util.*;

public class Example02 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList<String> cats = new LinkedList<String>();
		
		cats.add("러시안블루");
		cats.addFirst("페르시안");
		cats.addLast("래그돌");
		cats.add(1, "샴");
		
		System.out.println(cats);
		
		cats.set(2, "코리안쇼트헤어");
		
		cats.removeFirst(); // 맨앞의 요소삭제
		cats.removeLast();  // 맨 뒤의 요소삭제
		cats.remove(1);     // 인덱스가 1인 요소 삭제
		cats.clear();       // 모든 요소 삭제

		System.out.println(cats.size());
		
		cats.add("러시안블루");
		cats.addFirst("페르시안");
		cats.addLast("래그돌");
		System.out.println(cats);
		
		cats.add(1, "샴");
		System.out.println(cats);
		
		cats.set(2, "코리안쇼트헤어");
		System.out.println(cats);
		
		cats.removeFirst();
		cats.removeLast();
		System.out.println(cats);
		cats.remove(1);
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
	}

}
