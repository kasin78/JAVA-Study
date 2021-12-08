package reading_lineByline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\JAVA\\Java-Study\\CH20_Reading_Writing\\test.txt";
		
		System.out.println(new File(fileLocation).exists()); // 파일이 실제로 있는지 확인
		System.out.println();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))) {
			// 파일을 읽기 위한 객체 생성
			// BufferedReader reader = new BufferedReader(new FileReader(fileLocation));
			
			// 파일 읽기
			String line = null;
			
			// 한줄씩 읽는데 null값이 아니면 계속 읽고 한줄씩 출력(while)
			// 파일의 끝에 더 이상 문자가 없으면 null값
			// 즉, 더이상 읽을 줄이 없으면 빠져 나옴
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			// reader.close();
			
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우
			// e.printStackTrace(); 빨간색 예외처리
			System.out.println("파일을 찾지 못했음 : " + fileLocation);
			
		} catch (IOException e) {
			// 파일 읽지 못함 예외
			// e.printStackTrace();
			System.out.println("파일을 읽지 못함 : " + fileLocation);
		}
		
		
	}

}
