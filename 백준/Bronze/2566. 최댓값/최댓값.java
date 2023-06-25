import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			int[][] arr = new int[9][9];
			// 입력
			for(int i=0; i<9; i++) {
				String str = br.readLine();
				for(int j=0; j<9; j++) {
					arr[i][j] = Integer.parseInt(str.split(" ")[j]);
				}
			}
			// 최대값
			int max=0;
			// 위치
			int n=1;
			int m=1;
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					if(max<arr[i][j]) {
						max=arr[i][j];
						n=i+1;
						m=j+1;
					}
				}
			}
			
			System.out.println(max);
			System.out.println(n+" "+m);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}