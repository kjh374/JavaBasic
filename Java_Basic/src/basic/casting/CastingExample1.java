package basic.casting;

public class CastingExample1 {

	public static void main(String[] args) {

		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		  자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		  (promotion, UpCasting)
		  
		  정수 자료형 < 실수 자료형: 표현 범위가 훨씬 다양합니다.
		  boolean true/false 이외에는 받지 않는다.(변환대상x)
		  
		 */
		
		byte b = 10;
		int i = b; // byte -> int로 변환된 후 대입 연산 진행.
		System.out.println(i);
		
		char c = 'A';
		int j = c;
		System.out.println("'A'의 문자번호: " + j);
		
		char c1 = '홓';
		int j1 = c1;
		System.out.println("'홓'의 문자번호: " + j1);
		
		int k = 500;
		double d = k;
		System.out.println(d); // 인생
		
		
		
		
		
	}

}
