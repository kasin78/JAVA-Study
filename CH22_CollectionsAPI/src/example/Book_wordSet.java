package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이때 리스트는 단어가 중복되지 않는다. 알파벳 순으로 저장 => treeset
		File wordsGatsby = new File("gatsby.txt");
		// C:\JAVA\Java-Study\CH22_CollectionsAPI\gatsby.txt
		File wordsMeta = new File("metamorph.txt");
	
		System.out.println(wordsGatsby.exists());
		System.out.println(wordsMeta.exists()); // 파일이 있는지 확인
		
		TreeSet<String> gatsby = loadWords(wordsGatsby);
		TreeSet<String> metamorph = loadWords(wordsMeta);
		
		System.out.println(gatsby.size());
		System.out.println(metamorph.size()); // 단어의 갯수
		
//		for (String w : gatsby) {
//			System.out.println(w);
//		}
		
		displaywords(gatsby);
		displaywords(metamorph);
	}

	/**
	 * 입력된 파일을 읽어서 단어들을 저장해서 마지막에 treeset 리스트로 리턴
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = null;
			
			while((line = reader.readLine()) != null) {
				String[] words = line.split("[^a-zA-z]+");
				// treeset에 단어로 분리해서 입력한다(자동 정렬 및 중복제거)
				for (String w : words) {
					if (w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase());
				}
			}		
		} 
		catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음");
		} 
		catch (IOException e) {
			System.out.println("파일을 읽지 못함");
		}
		return wordSet;
	}
	
	/**
	 * 트리셋을 입력받아 그 안에 단어들을 출력한다
	 * @param list
	 */
	private static void displaywords(TreeSet<String> list) {
		int count = 0;
		for (String w : list) {
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}	
	}
}
