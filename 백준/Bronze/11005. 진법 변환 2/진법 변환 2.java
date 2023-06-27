import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
	
		// 숫자로 표시할 수 없는 자리 
		Map<Integer, Character> jin = new HashMap<>();
		for(int i=0; i<26; i++) {
			jin.put(i+10, (char)('A'+i));
		}
		
		int n = s.nextInt(); // 10진수
		int b = s.nextInt(); // b진수
		
		List<Integer> list = new ArrayList<>();
		int i=0;
		while(n>=b) {
			list.add(n%b);
			n=n/b;
		}list.add(n);
		
		String[] r = new String[list.size()];
		i=0;
		for(int k=r.length-1; k>=0; k--) {
			if(jin.get(list.get(i))!=null) {
				r[k] = String.valueOf(jin.get(list.get(i++)));
			} else {
				r[k] =  String.valueOf(list.get(i++));
			}
		}
		
		for(int k=0; k<r.length; k++) {
			System.out.print(r[k]);
		}
	}
}