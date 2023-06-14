import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BufferedReader와 BufferedWriter를 사용할 수 있다. 
		// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다
		
		// BufferedReader의 ReadLine()을 사용하면 데이터를 라인 단위로 읽을 수 있음
		// ReadLine()의 리턴값은 String이므로 다른 타입으로 입력받으려면 형 변환 필요
		// 공백 단위로 데이터를 처리할경우 StringTokenizer의 nextToken() or String의 split()이용
		
		// BufferedWriter는 System.out.println("")이랑 동일하게 사용 가능한 함수
		// 개행을 하려면 write에 \n이나 newLine()이용
		// 버퍼를 이용하므로 사용이 끝난 뒤에 버퍼를 비워줘야함
		// flush()함수를 통해 버퍼에 남아있는 데이터를 출력해 없앤 후 close()함수를 통해 스트림을 종료
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// 문자열을 정수로 변환 후 받음
			int num=Integer.parseInt(br.readLine());
			int[] sum = new int[num];
			
			for(int i=0; i<num; i++) {
				String str = br.readLine();
				String[] strArr = str.split(" ");
				sum[i] = Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1]);
				// 매개변수로 입력받는 값은 Ascii Code값으로 인식됨
				// String.valueOf()를 사용하여 형변환 후 출력
				bw.write(String.valueOf(sum[i]));
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}