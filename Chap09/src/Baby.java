
public class Baby implements Papa, Mama{

	@Override
	public void genderMother() {
		System.out.println("나는 어머니");
		
	}

	@Override
	public void genderFather() {
		System.out.println("나는 아버지");
	}
	
	public void printInfo() {
		System.out.println("나는 아기입니다");
	}

}
