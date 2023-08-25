package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {

		/*
         1. 정수를 두개 입력받으세요. (x, y)
         2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
         ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
         
         처음에는 x에 무조건 작은 값이 들어올 것이라고 예상하고 작성하겠습니다.
         다 하신 분은 만약 x에 큰 값이 들어왔을 경우에는
         어떻게 대처할 지 생각해 보세요.
         (x에 큰 값이 들어와도 정상적으로 출력이 되었으면 좋겠습니다.
         입력: 7, 3 -> "3부터 7까지의 누적합계: 25")
         - while문을 if else 로 나눠서 두번 쓰는 것은 지양하겠습니다.
    	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		int y = sc.nextInt();
		
//		int z = x + y;
//		if(x<y) {
//			x = z - x;
//			y = z - y;
//		}
		
//		if(x<y) {
//			int z = x;
//			x = y;
//			y = z;
//		}
		
//		int start = (x > y ? y : x);
//		int end = (x > y ? x : y);
		
		int num1 = x;
		int num2 = y;
		int total = 0;
		while(x != y) {
			if(x < y) {
				total += x;
				x++;
			}else {
				total += y;
				y++;
			}
		}
//		System.out.printf("%d부터 %d까지 누적합계: %d", (num1<num2 ? num1 : num2), (num1<num2 ? num2 : num1),total+x);
		System.out.printf("%d부터 %d까지 누적합계: %d", num1, num2,total+x);
		
	}

}
