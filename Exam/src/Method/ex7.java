package Method;

public class ex7 {

	public static void main(String[] args) {
		// 변수 생성
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		// 결과 출력
		System.out.printf("Tom의 오디션 결과 : %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과 : %s\n", test(kateVocal, kateDance));	
	}
	
	// 보컬*댄스 = 70.0 이상이면 합격
	public static String test(double vocal, double dance) {
		String result = (vocal*dance >= 70)? "통과" : "실패";
		return result;
	}

}
