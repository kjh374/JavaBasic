package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		/*
         - 정수 3개를 입력 받습니다.
         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
         
         # max, mid, min이라는 변수를 미리 선언하셔서
          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
          마지막에 한번에 출력하시면 되겠습니다.
         */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 3개 입력하세요: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if(x > y && x > z) {// x가 max다!
			max = x;
			if(y>z) {
				mid = y;
				min = z;
			}else {
				mid = z;
				min = y;					
			}
			
		}else if (y>x && y>z) {// y가 max다!
			max = y;
			if(x>z) {
				mid = x;
				min = z;
			}else {	
				mid = z;
				min = x;
			}
		}else { // z가 max다!
			max = z;
			if(x>y) {
				mid = x;
				min = y;
			}else {
				mid = y;
				min = x;
			}
		}
		
		System.out.println("----------------------");
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
//		if(x > y && x > z && y > z) {
//			max = x;
//			mid = y;
//			min = z;
//		}else if(x > y && x > z && y < z) {
//			max = x;
//			mid = z;
//			min = y;
//		}else if(x < y && x > z && y > z) {
//			mid = x;
//			min = z;
//			max = y;
//		}else if(x < y && x < z && y > z) {
//			min = x;
//			mid = z;
//			max = y;
//		}else if(x > y && x < z && y < z) {
//			mid = x;
//			max = z;
//			min = y;
//		}else if(x < y && x < z && y < z) {
//			min = x;
//			max = z;
//			mid = y;
//		}else {
//			System.out.println("동일한 값이 존재합니다.");
//		}
//		System.out.printf("max: %d mid: %d min: %d", max, mid, min);
		sc.close();
	}
}
