package reading_writiing_txt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

	public static void main(String[] args) throws IOException { // 파일에 글을 못 적었을때 표시
		// 텍스트 읽고 쓰기
		String text = "헬로우! \n 하 아 유?"; // 적을 내용
		
		Path path = Paths.get("C:\\JAVA\\new.txt");
		// 파일의 경로(C:\JAVA\Java-Study\CH20_Reading_Writing\text.txt)
		
		// 쓰기 : text.txt에 위의 text 내용을 적기
		// Files 클래스의 스테틱 메소드 write(적을 파일의 경로, 적을 내용(byte단위))
			// 파일이 없을 경우 새로 만들어줌(프로젝트 실행전 text.txt 파일 없었음)
		Files.write(path, text.getBytes());
		
		// 읽기
		String recievedText = Files.readString(path);
		System.out.println(recievedText);
		
	}

}
