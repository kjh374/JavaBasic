package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {

		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 연산퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		System.out.println("-----------------");
		int count = 0;
		int countx = 0;
		
		while(true) {
			int x = (int) (Math.random()*100 + 1);
			int y = (int) (Math.random()*100 + 1);
			int num = (int) (Math.random()*2);
			
			int correct; //정답
			if(num ==0) {
				System.out.printf("%d + %d = ???\n", x, y);
				correct = x + y;
			}else {
				System.out.printf("%d - %d = ???\n", x, y);
				correct = x - y;
				
			}
			
			System.out.print("> ");
			int answer = sc.nextInt();
			if(answer == correct) {
				System.out.println("정답입니다~");
				count++;
			}else if(answer == 0) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("유감입니다~");
				countx++;
			}
		}
		System.out.println("---------------------");
		System.out.println("정답 횟수: " + count + "회");
		System.out.println("오답 횟수: " + countx + "회");
		
		
		
		
		
		sc.close();
		
	}
	

}
