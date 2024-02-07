import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        Arrays.sort(arr);
        List<int[]> list = Arrays.asList(arr);
        list.remove(0);
        
        if(list.isEmpty()) {
        	return new int[] {-1};
        }
        return answer;
    }
}

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
