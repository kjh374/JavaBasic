package etc.api.lang.wrapper;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class ParseQuiz {

	//	주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.
	//
	//	ex) 입력값: 9201013-1234567
	//	출력값: 1992년 10월 13일 31세 남자 
	//
	//	입력값: 040906-4123456
	//	출력값: 2004년 9월 6일 19세 여자 
	//
	//	입력값은 하이픈이 포함된 문자열이어야 합니다. 
	//	하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
	//	또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = null;
		try {
			outer: while(true) {
				System.out.println("ex)040906-4123456");
				System.out.print("'-'을 포함하여 주민등록번호를 모두 입력해주세요: ");
				input = sc.nextLine();
				if(input.length()!=14) {
					System.out.print("자리수가 이상하네요~ ");
					continue;
				}
				
				String[] str = input.split("-");
				if(str.length>2) {
					System.out.println(" '-'가 너무 많아요~");
					continue;
				}
//				if(input.charAt(6)!='-') {
//					System.out.println("하이픈이 없어요~");
//					continue;
//				}
				if(input.indexOf("-") == -1) {
					System.out.println("하이픈이 없어요~");
					continue;					
				}
				input = input.replace("-", "");
				for(int i=0; i<input.length(); i++) {
					if(!(input.charAt(i) >= '0' && input.charAt(i) <= '9')) {
						System.out.println("숫자가 아니네요~ ");
						continue outer;
					}
				}
				
				if(input.charAt(6)<'1' || input.charAt(6)>'4') {
					System.out.println("22세기에서 오셨나? ");
					continue;
				}
				break;

			}
		} catch (Exception e) {
			System.out.println("에러~");
		} finally {
			sc.close();
		}
		int year = Integer.parseInt(input.substring(0, 2)) <= 23? 2000 +Integer.parseInt(input.substring(0, 2)) : 1900 + Integer.parseInt(input.substring(0, 2));
		int month = Integer.parseInt(input.substring(2, 4));
		int day = Integer.parseInt(input.substring(4, 6)); 
		int age = 2023-year;
		String gender = Integer.parseInt(input.substring(6, 7))%2 != 0? "남자":"여자";
		System.out.printf("출력값: %d년 %d월 %d일 %d세 %s", year, month, day, age, gender);
	}
}
