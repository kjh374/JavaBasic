package basic.datatype;

public class IntegerExample {

	public static void main(String[] args) {

		/*
        # 리터럴: 변수에 저장되기 전의 상수값.
        자바의 정수 리터럴의 타입은 int 입니다.
        int보다 더 큰 범위의 수를 표현하기 위해서는 뒤에 L을 붙여서
        long타입으로 인식시켜야 합니다.
        */
		
		byte a = 127;
//		byte a = 128; (x)
		short b = 32767; 
//		short b = 32768; (x)
		int c = 214748347;
//		long d = 2147483648;(x)
		long d = 2147483648L; 
	
	}

}
