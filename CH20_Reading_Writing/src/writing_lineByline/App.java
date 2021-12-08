package writing_lineByline;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\JAVA\\Java-Study\\CH20_Reading_Writing\\test.txt";
		
		System.out.println(new File(fileLocation).exists()); // 파일이 실제로 있는지 확인
		System.out.println();
		
		// 파일 쓰기
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation))) {
			writer.write("오렌지");
			writer.newLine();
			writer.write("애플");
			writer.newLine();
			writer.write("바나나");
			writer.newLine();
			writer.write("배");
			writer.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("파일을 쓸 수 없음 : " + fileLocation);
		}
		
		System.out.println("파일 쓰기 완료 : " + fileLocation);
		
	}

}
