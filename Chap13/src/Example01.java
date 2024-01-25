import java.util.*;

public class Example01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList(); 
		//클래스 유형 미설정 Object로 선언
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		//int형의 객체 요소만 사용 가능
		
		ArrayList<String> cats = new ArrayList<String>();

		cats.add("페르시안"); //값 추가
		//cats.add(null); //null 값 추가
		cats.add(1, "샴"); // 인덱스 1에 값("샴") 추가
		//페르시안, 샴, null
		
		for (String cat : cats) { //cat에 cats의 요소들을 담음
			System.out.println(cat);
		}
		
		Iterator iter = cats.iterator();
				
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		

		
		String cat = new String("페르시안");
		cats.add(cat); //객체 생성 후 추가
		
		cats.add(new String("샴"));
		//객체 생성과 동시에 추가
		
		cats.set(2, "러시안블루"); //인덱스가 2인 요소를 "러시안블루"로 변경
		
		cats.remove("페르시안");
		cats.remove(1);
		cats.clear();
		
		for (String cat2 : cats) { //cat에 cats의 요소들을 담음
			System.out.println(cat);
		}
		
		//System.out.println(cats.size());
		
		cats.add("페르시안");
		cats.add("null");
		System.out.println(cats);
		
		cats.add(1, "샴");
		System.out.println(cats);
		
		cats.set(2, "러시안블루");
		System.out.println(cats);
		
		cats.remove("페르시안");
		System.out.println(cats);
		
		cats.remove(1);
		System.out.println(cats);
		
		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("샴"));
		System.out.println(cats.indexOf("샴"));
		
		
	}

}
