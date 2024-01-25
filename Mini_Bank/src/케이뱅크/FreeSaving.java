package 케이뱅크;

//자유적금 - 자식
public class FreeSaving extends AccountProduct{
	FreeSaving(String name){ //매개변수는 고객이름
		this.name = name;
		rate = 0.043;
	}

}
