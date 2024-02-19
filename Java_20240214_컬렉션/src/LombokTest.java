import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Setter 
@Getter
@ToString*/

//@Data가 getter, setter, tostring, equals, hashcode 생성해줌

@Data
@AllArgsConstructor //매개변수 받아주는 생성자
@NoArgsConstructor //디폴트 생성자 - 매개변수 없는 생성자
public class LombokTest {

	int a;
	int b;
	int c;
	int d;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
