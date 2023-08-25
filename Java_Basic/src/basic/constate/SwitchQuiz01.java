package basic.constate;

import java.util.Scanner;

public class SwitchQuiz01 {
	
	public static void main(String[] args) {
				
		/*
	         - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
	          다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
	          연산 결과를 출력해 주시면 됩니다. (switch문 사용)
	          연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
          결과를 말씀해 주세요.
         */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt();
		System.out.print("연산자를 입력하세요: ");
		String op = sc.next();
		
		System.out.print("정수를 입력하세요: ");
		int j = sc.nextInt();
		
		int result = 0;
		
		boolean flag = false;
		
		switch(op) {
		case "+":
			result = i + j;
			break;
		case "-":
			result = i - j;
			break;
		case "*":
			result = i * j;
			break;
		case "/":
			if(j==0) {
				System.out.println("0으로 못나눠요~");
				flag = true;
				break;
			}else {
				result = i / j;
				break;				
			}
		case "%":
			result = i % j;
			break;
//		case "+":
//			System.out.println(i + j);
//			break;
//		case "-":
//			System.out.println(i - j);
//			break;
//		case "*":
//			System.out.println(i * j);
//			break;
//		case "/":
//			System.out.println(i / j);
//			break;
//		case "%":
//			System.out.println(i % j);
//			break;
		default:
			System.out.println("연산자를 제대로 입력해주세요.");
		}
		if(!flag) {	// 이해가 안된다. if(false)는 건너뛰나?		
			System.out.printf("%d %s %d = %d", i, op, j, result);
		}
		
		sc.close();
		
	}
}
