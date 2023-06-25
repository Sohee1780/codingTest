import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String str = br.readLine();
			int n = Integer.parseInt(str.split(" ")[0]);
			int m = Integer.parseInt(str.split(" ")[1]);
			
			int[][] arr1 = new int[n][m];
			int[][] arr2 = new int[n][m];
			
			// 행렬1 입력
			for(int i=0; i<n; i++) {
				String arr = br.readLine();
				for(int j=0; j<m; j++) {
					arr1[i][j] = Integer.parseInt(arr.split(" ")[j]);
				}
			}
			// 행렬2 입력
			for(int i=0; i<n; i++) {
				String arr = br.readLine();
				for(int j=0; j<m; j++) {
					arr2[i][j] = Integer.parseInt(arr.split(" ")[j]);
				}
			}
			// 계산
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					arr1[i][j] = arr1[i][j]+arr2[i][j];
				}
			} 
			// 출력
			for(int[] temp : arr1) {
	            for(int i : temp) {
	            	System.out.print(i+" ");
	            }
	            System.out.println();
	        }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}