import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			//배열 생성
			char[][] arr = new char[5][];
			
			for(int i=0; i<5; i++) {
				String str = br.readLine();
				arr[i] = str.toCharArray();
				// 최대 15글자
				arr[i]=Arrays.copyOf(arr[i], 15);
			}
			// 출력
			String str = "";
			for(int i=0; i<15; i++) {
				for(int j=0; j<5; j++) {
					if(arr[j][i]!=0) {
						str+=arr[j][i];
					}
				}
			}		
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}