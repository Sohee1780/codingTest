import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지
		boolean[][] square = new boolean[100][100];
		
		try {
			// 색종이의 수 n
			int n = Integer.parseInt(br.readLine());
			// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이
			// 색종이의 위치 x(왼쪽 변과 도화지의 왼쪽변 사이의 거리), y(색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리)

			for(int i=0; i<n; i++) {
				String str = br.readLine();
				int x = Integer.parseInt(str.split(" ")[0]);
				int y = Integer.parseInt(str.split(" ")[1]);
				
				for(int j=x-1; j<x+9; j++) {
					for(int k=y-1; k<y+9; k++) {
						square[j][k] = true;
					}
				}
 			}
			
			int area = 0;
			for(int j=0; j<100; j++) {
				for(int k=0; k<100; k++) {
					if(square[j][k]) area+=1;
					
				}
			}
			System.out.println(area);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}