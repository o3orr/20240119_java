package 케이뱅크;


// 자유적금
// 조상의 모든걸 상속받아서 생성자로 고객이름과 이율만 초기화
public class FreeSaving extends AccountProduct {
	FreeSaving(String name){
		this.name = name;
		rate = 0.043;
	}
}
