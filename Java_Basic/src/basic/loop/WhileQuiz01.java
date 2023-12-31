package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {

		/*
        # 사용자에게 구구단 단수를 입력받아서
        해당 단수의 구구단을 출력해 보세요.
        ex)
        
        구구단을 입력하세요: 4
        *** 구구단 4 단 ***
        4 x 1 = 4
        4 x 2 = 8
        4 x 3 = 12
        4 x 4 = 16 
        .
        .
        .
        4 x 9 = 36
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 입력하세요: ");
		int dan = sc.nextInt();
		
		System.out.printf("*** 구구단 %d 단 ***\n", dan);
		int n = 1;
		while(n <= 9) {
			if(n <= 4 || n >= 9) {
				System.out.printf("%d x %d = %d\n", dan, n, dan*n);				
			}else {
				System.out.println(".");
			}
			
			n++;
		}
		sc.close();
	}

}
