import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);	
		String n = s.next();
		int b = s.nextInt();
		
		// 숫자로 표시할 수 없는 자리 
		Map<Character, Integer> jin = new HashMap<>();
		for(int i=0; i<26; i++) {
			jin.put((char)('A'+i), i+10);
		}
		
		char[] nArr = n.toCharArray();
		int[] na = new int[nArr.length];
		
		for(int i=0; i<nArr.length; i++) {
			if(jin.get(nArr[i]) != null) {
				na[i]=jin.get(nArr[i]);
			}else na[i]= Integer.parseInt(String.valueOf(nArr[i]));
		}
		
		int c=0;
		for(int i=na.length-1; i>=0; i--) {	
			na[i]=(int)(na[i]*Math.pow(b, c++));	
		}

		int res = 0;
		for(int i=0; i<na.length; i++) {
			res+=na[i];	
		}
		System.out.println(res);
	}
}