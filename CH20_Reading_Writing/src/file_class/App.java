package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체를 만들기
		File currentDirectory = new File("."); // 현재 폴더위치로 객체 생성
												   // 1.txt는 현재 프로젝트 폴더 안에 있는 파일
		
		System.out.println(currentDirectory.getAbsolutePath()); // 파일 객체의 절대경로 출력(현재 프로젝트 폴더)
		System.out.println(currentDirectory.getCanonicalPath()); // 파일의 정규 경로를 문자열로 반환한다
		
		// 폴더 내부 파일들을 출력
		for (String f : currentDirectory.list()) {
			System.out.println(f);
		}
		
		
	}

}
