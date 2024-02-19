import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] code = s.split(""); // ['A', 'B']
        for (int i=0; i<code.length; i++) {
        	if (code[i].equals(" ")) {
        		continue;
        	}
        	
        	//code.ch
        }
        return answer;
    }
}


public class main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        for (int i=0; i<b; i++) {
        	for (int j=0; j<a; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
    }

}
