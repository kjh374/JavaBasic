package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {

		/*
        1. 주민등록번호 13자리를 입력받습니다.
        2. 주민등록번호는 -을 포함해서 받을 예정입니다.
        3. 13자리가 아니라면 다시 입력받습니다.
        4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-를 포함해서 주민등록번호 13자리를 입력하세요.");
		outer: while(true) {
			System.out.print("주민등록번호: ");
			String nums = sc.nextLine();
			nums = nums.replace("-", "");
			nums = nums.replace(" ", "");
			char c = nums.charAt(7);
			
			if(nums.length() != 13) {
				System.out.println("다시 입력해주세요.");
			} else {
				switch(nums.charAt(6)) {
				case '1': case '3':
					System.out.println("남자입니다.");
					break outer;
				case '2': case '4':
					System.out.println("여자입니다.");
					break outer;
				default:
					System.out.println("잘못입력하셨습니다.");
				}
			}
			
//			else if(String.valueOf(c).equals("1")) {
//				System.out.println("남자입니다.");
//				break;
//			}else {
//				System.out.println(nums.charAt(6));
//				System.out.println("여자입니다.");
//				break;
//			}
			
		}
		
		
		
	}

}
