package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};

		System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		 -추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.

		 */
		while(true) {
			
			if(kakao.length == 0) {
				System.out.println("더이상 삭제할 친구가 없네요.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("삭제를 원하는 친구를 입력하세요: ");
			String name = sc.next();
			
			boolean flag = true;
			for(int i=0; i<kakao.length; i++) {
				if(name.equals(kakao[i])) {
					flag = false;
					for(int j=i; j<kakao.length-1; j++) {
						kakao[j] = kakao[j+1];
					}
					System.out.println(flag);
					break;
				}
			}
			
			if(!flag) { //!flag 는 flag == false 냐? // if(flag) => if (flag == true 냐?)
				System.out.println(flag);
				System.out.println(name + "(은)는 없는 이름입니다.");
				
			}else {
				String[] temp = new String[kakao.length-1];
				for(int k=0; k<temp.length; k++) {
					temp[k] = kakao[k];
				}
				kakao = temp; temp = null;
				System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
			}
		}
		
		sc.close();
		
		
		
		
		
		
//		int i;
//		outer: for(i =0; i<kakao.length; i++) {
//			System.out.print("> ");
//			String df = sc.nextLine();
//			if(df.equals("")) {
//				System.out.println("입력받은 이름이 없습니다.");
//				i--;
//				continue outer;
//			}
//			if(kakao[i].equals(df)) {
//				for(; i<kakao.length-1; i++) {
//					
//					kakao[i] = kakao[i+1];
//				}
//				continue outer;
//			}
//		}
//				kakao = newf;
//				String[] newf = new String[kakao.length-1];
//				for(int j=0; j<newf.length; j++) {
//					newf[j] = kakao[j];
//				}
//				System.out.println(Arrays.toString(kakao));

		
	}

}
